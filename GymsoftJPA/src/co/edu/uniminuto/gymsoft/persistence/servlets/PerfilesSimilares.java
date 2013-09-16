package co.edu.uniminuto.gymsoft.persistence.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.edu.uniminuto.gymsoft.persistence.daos.UsuarioDAOImpl;
import co.edu.uniminuto.gymsoft.persistence.model.Usuario;

/**
 * Servlet implementation class PerfilesSimilares
 */
@WebServlet("/PerfilesSimilares")
public class PerfilesSimilares extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public PerfilesSimilares() {
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
		// TODO Auto-generated method stub

		UsuarioDAOImpl usrDaoImpl = new UsuarioDAOImpl();
		PrintWriter print = response.getWriter();

		// **De acuerdo al parámetro de búsqueda, selecciono el query:
		String parametroBusqueda = "";

		if (request.getParameter("comparacionSelect").equalsIgnoreCase(
				"MAYOROIGUAL")) {
			parametroBusqueda = ">=";
		} else if (request.getParameter("comparacionSelect").equalsIgnoreCase(
				"MENOROIGUAL")) {
			parametroBusqueda = "<=";
		} else if (request.getParameter("comparacionSelect").equalsIgnoreCase(
				"IGUALA")) {
			parametroBusqueda = "=";
		}

		String campo = "";
		if (request.getParameter("parametroSelect").equalsIgnoreCase("ALTURA")) {
			campo = "altura";
		} else if (request.getParameter("parametroSelect").equalsIgnoreCase(
				"PERFIL")) {
			campo = "perfil";
		} else if (request.getParameter("parametroSelect").equalsIgnoreCase(
				"GENERO")) {
			campo = "genero";
		}

		String valor = request.getParameter("valor");

		List<Usuario> usrsPerfilesSimilares;
		usrsPerfilesSimilares = usrDaoImpl.getUsuariosCamposDinamicos(campo,
				parametroBusqueda, valor);

		if (usrsPerfilesSimilares == null) {
			print.println("<h1>!! NO HAY RESULTADOS DE CONSULTA !! </h1>");
		} else {
			print.println("<table border='1'");
			print.println("<tbody>");
			print.println("<thead>");
			print.println("<tr>");
			print.println("<th colspan='6'>" + "REGISTROS DE USUARIOS CON:  "
					+ campo + parametroBusqueda + valor + "</th>");
			print.println("</tr>");
			print.println("<tr>");
			print.println("<th>IDENTIFICACION</th>");
			print.println("<th>NOMBRES</th>");
			print.println("<th>GENERO</th>");
			print.println("<th>FECHA DE NACIMIENTO</th>");
			print.println("<th>ALTURA</th>");
			print.println("<th>PERFIL</th>");
			print.println("</tr>");
			print.println("</thead>");
			print.println("</tbody>");

			for (Usuario usuario : usrsPerfilesSimilares) {
				print.println("<tr>");
				print.println("<th>" + usuario.getIdUsuario() + " </th>");
				print.println("<th>" + usuario.getNombre() + " </th>");
				print.println("<th>" + usuario.getGenero() + " </th>");
				print.println("<th>" + usuario.getFechanacimiento().toString()
						+ " </th>");
				print.println("<th>" + usuario.getAltura() + " </th>");
				print.println("<th>" + usuario.getPerfil() + " </th>");
				print.println("</tr>");
			}
			print.println("</tbody>");
			print.println("</table>");
		}

	}

}
