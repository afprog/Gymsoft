package co.edu.uniminuto.gymsoft.persistence.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.edu.uniminuto.gymsoft.persistence.daos.SedeDAOImpl;
import co.edu.uniminuto.gymsoft.persistence.daos.UsuarioDAOImpl;
import co.edu.uniminuto.gymsoft.persistence.model.Actividad;
import co.edu.uniminuto.gymsoft.persistence.model.Sede;
import co.edu.uniminuto.gymsoft.persistence.model.Usuario;

/**
 * Servlet implementation class CreacionActividades
 */
@WebServlet("/CreacionActividades")
public class CreacionActividades extends HttpServlet {
	private static final long serialVersionUID = 1L;

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
		UsuarioDAOImpl usuario = new UsuarioDAOImpl();
		SedeDAOImpl sedeDaoImpl = new SedeDAOImpl();

		// Pasa como par�metro los id�s de los usuarios seleecionados.
		// Convierte de [] a una lista
		List<Usuario> listaUsuarios = usuario.getUsuariosPorCedulas(toStringInt(usuarios));

		System.out.println("Usuarios traidos:" + listaUsuarios.size());
		
		// Trae el objeto Sede seleccionado.
		List<Sede> sede = new ArrayList<Sede>();
		sede = sedeDaoImpl.getSedeById(Integer.parseInt(request
				.getParameter("sedeSelect")));
		
		// La nueva actividad a ser insertada.
		Actividad actividad = new Actividad();

		// Formatea par�metros Strings.
		actividad.setTipo(request.getParameter("actividadSelect"));
		actividad.setLugarFisico(request.getParameter("lugarFisicoSelect"));
		actividad.setUsuarios(listaUsuarios);
		actividad.setSede(sede.get(0));//Trae el �nico encontrado.
		
		
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

		// Busca y settea la Sede escogida.
		System.out.println("LA fecha es:" + fechaEscogida.toString());
		System.out.println("las cedulas como parametro: "
				+ toStringInt(usuarios));

		// Almacenar el registro de la nueva Actividad.
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public String toStringInt(String identificaciones[]) {
		StringBuilder cedulas = new StringBuilder();
		for (int i = 0; i < identificaciones.length; i++) {
			if (i == 0) {
				cedulas.append(identificaciones[i]);
			} else {
				cedulas.append("," + identificaciones[i]);
			}
		}
		return cedulas.toString();
	}

}
