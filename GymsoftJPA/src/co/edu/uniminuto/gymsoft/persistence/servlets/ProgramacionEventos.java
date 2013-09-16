package co.edu.uniminuto.gymsoft.persistence.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.edu.uniminuto.gymsoft.persistence.daos.SedeDAOImpl;
import co.edu.uniminuto.gymsoft.persistence.model.Actividad;
import co.edu.uniminuto.gymsoft.persistence.model.Sede;
import co.edu.uniminuto.gymsoft.persistence.model.Usuario;

/**
 * Servlet implementation class ProgramacionEventos
 */
@WebServlet("/ProgramacionEventos")
public class ProgramacionEventos extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ProgramacionEventos() {
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

		SedeDAOImpl sedeDaoImpl = new SedeDAOImpl();
		Sede sedeConsultada = new Sede();
		List<Sede> sedes = sedeDaoImpl.getSedeById(Integer.parseInt(request
				.getParameter("sedeSelect")));
		sedeConsultada = sedes.get(0);

		PrintWriter print = response.getWriter();

		print.println("<table border='1'");
		print.println("<tbody>");
		print.println("<thead>");
		print.println("<tr>");
		print.println("<th colspan='5'>" + "EVENTOS PARA LA SEDE : "
				+ sedeConsultada.getNombre() + "</th>");
		print.println("</tr>");
		print.println("<tr>");
		print.println("<th colspan='5'>" + " DIRECCION : "
				+ sedeConsultada.getDireccion() + " </th>");
		print.println("</tr>");
		print.println("<tr>");
		print.println("<th>ID</th>");
		print.println("<th>TIPO</th>");
		print.println("<th>FECHA</th>");
		print.println("<th>LUGAR DENTRO DE LA SEDE</th>");
		print.println("<th>PERSONAS ASIGNADAS</th>");
		print.println("</tr>");
		print.println("</thead>");
		print.println("<tbody>");

		for (Sede sede : sedes) {
			for (Actividad actividad : sede.getActividads()) {
				print.println("<tr>");
				print.println("<td>" + actividad.getIdActividad() + " </td>");
				print.println("<td>" + actividad.getTipo() + " </td>");
				print.println("<td>" + actividad.getFecha().toString()
						+ " </td>");
				print.println("<td>" + actividad.getLugarFisico() + " </td>");
				String usuarios="";
				for (Usuario usuario : actividad.getUsuarios()) {
					usuarios += "<strong> Identify: </strong>" + usuario.getIdUsuario()+ "  <strong>Nombre: </strong>" + usuario.getNombre() +"\n";
				}
				if(usuarios!=""){
				//Celda para los Usuarios
				print.println("<td>"+ usuarios + "<td>");
				}
				print.println("</tr>");

			}
		}
		print.println("</tbody>");

	}
}
