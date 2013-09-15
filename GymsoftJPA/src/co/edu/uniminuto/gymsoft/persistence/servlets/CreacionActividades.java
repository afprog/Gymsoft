package co.edu.uniminuto.gymsoft.persistence.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.edu.uniminuto.gymsoft.persistence.daos.ActividadDAOImpl;
import co.edu.uniminuto.gymsoft.persistence.daos.SedeDAOImpl;
import co.edu.uniminuto.gymsoft.persistence.daos.UsuarioDAOImpl;
import co.edu.uniminuto.gymsoft.persistence.model.Actividad;
import co.edu.uniminuto.gymsoft.persistence.model.Sede;
import co.edu.uniminuto.gymsoft.persistence.model.Usuario;
import co.edu.uniminuto.gymsoft.persistence.vo.RegistroActividadVo;
import co.edu.uniminuto.gymsoft.persistence.vo.RegistroUsuarioVo;

/**
 * Servlet implementation class CreacionActividades
 */
@WebServlet("/CreacionActividades")
public class CreacionActividades extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private RegistroActividadVo registroAvtividadVo;
	private RegistroUsuarioVo registroUsuarioVo;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CreacionActividades() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter io = response.getWriter();
		String usuarios[];
		usuarios = request.getParameterValues("usuarios");
		UsuarioDAOImpl usuarioDaoImpl = new UsuarioDAOImpl();
		SedeDAOImpl sedeDaoImpl = new SedeDAOImpl();
		ActividadDAOImpl ultimaActividad = new ActividadDAOImpl();

		// Pasa como parámetro los id´s de los usuarios seleecionados.
		// Convierte de [] a una lista
		List<Usuario> listaUsuarios = usuarioDaoImpl
				.getUsuariosPorCedulas(toStringInt(usuarios));

		// Trae el objeto Sede seleccionado.
		List<Sede> sede = new ArrayList<Sede>();
		sede = sedeDaoImpl.getSedeById(Integer.parseInt(request
				.getParameter("sedeSelect")));
		
		System.out.println("la sede encontrada:" + sede.get(0).getNombre());

		// La nueva actividad a ser insertada.
		Actividad actividad = new Actividad();

		// Formatea parámetros Strings.
		actividad.setTipo(request.getParameter("actividadSelect"));
		actividad.setLugarFisico(request.getParameter("lugarFisicoSelect"));
		actividad.setUsuarios(listaUsuarios);
		actividad.setSede(sede.get(0));// Trae el único encontrado.

		// Formatea la fecha que ingresa.
		Date fechaEscogida = null;
		SimpleDateFormat formateador = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		try {
			fechaEscogida = formateador.parse(request.getParameter("fecha")
					.replaceAll("T", " "));
			actividad.setFecha(fechaEscogida);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Almacenar el registro de la nueva Actividad.
		try {
			this.registroAvtividadVo = new RegistroActividadVo(actividad);
			this.registroAvtividadVo.guardarActividad();

			// Consulta la actividad que se acabo de crear
			actividad = ultimaActividad.getActividadPorId(ultimaActividad
					.getIdUltimaActividadRegistrada());

			// Actualiza en cada usuario la actividad que se acabó de crear.
			for (Usuario usr : listaUsuarios) {
				usr.setActividad(actividad);
				registroUsuarioVo = new RegistroUsuarioVo(usr);
				registroUsuarioVo.actualizarUsuario();
			}

			io.println("<html>");
			io.println("<h1>Actividad almacenada Exitosamente !!! </h1>");
			io.println("</html>");

		} catch (Exception e) {
			io.println("<h1>hubo un problema al insertar la actividad </h1>");
			e.printStackTrace();
		}

	}

	/* Formatea un conjunto de datos y forma un Strig */
	public String toStringInt(String identificaciones[]) {
		StringBuilder cedulas = new StringBuilder();
		for (int i = 0; i < identificaciones.length; i++) {
			if (i == 0) {
				cedulas.append("'" + identificaciones[i] + "'");
			} else {
				cedulas.append("," + "'" + identificaciones[i] + "'");
			}
		}
		return cedulas.toString();
	}

}
