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

import org.apache.jasper.tagplugins.jstl.core.Out;

import co.edu.uniminuto.gymsoft.persistence.daos.UsuarioDAOImpl;
import co.edu.uniminuto.gymsoft.persistence.model.AsignacionMaquina;
import co.edu.uniminuto.gymsoft.persistence.model.Usuario;

/**
 * Servlet implementation class MaquinaUsuario
 */
@WebServlet("/MaquinaUsuario")
public class MaquinaUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;

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
		
		PrintWriter print= response.getWriter();
		print.println(request.getParameter("usuarioSelect"));
		print.println(request.getParameter("maquinaSelect"));
		print.println(request.getParameter("fecha"));
		print.println(request.getParameter("horaInicio"));
		print.println(request.getParameter("horaFin"));
		
		AsignacionMaquina asignacion = new AsignacionMaquina();

		Usuario escogido = new Usuario();
		UsuarioDAOImpl usrDaoImpl = new UsuarioDAOImpl();
		List<Usuario> usuariosDevueltos;
		usuariosDevueltos = usrDaoImpl.getUsuarioByIdusuario(Integer
				.parseInt(request.getParameter("usuarioSelect")));
		asignacion.setUsuario(usuariosDevueltos.get(0));// EL único resultado
		
		// Date fecha = null;
		//
		// SimpleDateFormat formatoDelTexto = new
		// SimpleDateFormat("yyyy-MM-dd ");
		// try {
		// fecha = formatoDelTexto.parse(request.getParameter("fecha"));
		// } catch (ParseException e) {
		// e.printStackTrace();
		// }
		//
		//
	
	
	
	
	
	}

}
