package co.edu.uniminuto.gymsoft.persistence.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.edu.uniminuto.gymsoft.persistence.daos.MaquinaDAOImpl;
import co.edu.uniminuto.gymsoft.persistence.daos.UsuarioDAOImpl;
import co.edu.uniminuto.gymsoft.persistence.model.AsignacionMaquina;
import co.edu.uniminuto.gymsoft.persistence.model.Maquina;
import co.edu.uniminuto.gymsoft.persistence.model.Usuario;
import co.edu.uniminuto.gymsoft.persistence.vo.RegistroMaquinaUsuarioVo;

/**
 * Servlet implementation class MaquinaUsuario
 */
@WebServlet("/MaquinaUsuario")
public class MaquinaUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private RegistroMaquinaUsuarioVo registroMaquinaUsuarioVo;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MaquinaUsuario() {
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

		PrintWriter print = response.getWriter();

		AsignacionMaquina asignacion = new AsignacionMaquina();

		UsuarioDAOImpl usrDaoImpl = new UsuarioDAOImpl();
		MaquinaDAOImpl mqnDaoImpl = new MaquinaDAOImpl();

		List<Usuario> usuariosDevueltos;
		usuariosDevueltos = usrDaoImpl.getUsuarioPorCedula(Integer
				.parseInt(request.getParameter("usuarioSelect")));

		List<Maquina> maquinasConsultadas;
		maquinasConsultadas = mqnDaoImpl.getMaquinaByIdmaquina(Integer
				.parseInt(request.getParameter("maquinaSelect")));

		// Settea los argumentos para la nueva asignaccion
		asignacion.setUsuario(usuariosDevueltos.get(0));// EL único resultado
		asignacion.setMaquina(maquinasConsultadas.get(0));

		// Formatea la fecha que ingresa.
		Date fechaInicial = null;
		Date fechaFinal = null;
		SimpleDateFormat formateador = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		try {
			fechaInicial = formateador.parse(request.getParameter("fecha")
					.replaceAll("T", " "));
			fechaFinal = formateador.parse(request.getParameter("fecha")
					.replaceAll("T", " "));
			asignacion.setHoraini(fechaInicial);
			asignacion.setHorafin(fechaFinal);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		try {
			this.registroMaquinaUsuarioVo = new RegistroMaquinaUsuarioVo(
					asignacion);
			this.registroMaquinaUsuarioVo.guardarAsignacionActividad();
			print.println("SE HA REGISTRADO LA ASIGNACION USUARIO - MAQUINA  CON ÉXITO !!");
		} catch (Exception e) {
			print.println("HUBO UN PROBLEMA AL INTENTAR GUARDAD LA ASIGNACION");
		}

	}
}
