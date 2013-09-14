package co.edu.uniminuto.gymsoft.persistence.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.edu.uniminuto.gymsoft.persistence.model.Usuario;
import co.edu.uniminuto.gymsoft.persistence.vo.RegistroUsuarioVo;

/**
 * Servlet implementation class RegistroUsuario
 */
@WebServlet("/RegistroUsuario")
public class RegistroUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private RegistroUsuarioVo registroUsuarioVo;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistroUsuario() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Usuario record = new Usuario();
		Date fecha = null;
		record.setNombre(request.getParameter("nombre"));
		record.setGenero(request.getParameter("nombre"));
		record.setAltura(Integer.parseInt(request.getParameter("estatura")));
		SimpleDateFormat formatoDelTexto = new SimpleDateFormat("MM/dd/yyyy");
		try {
			fecha = formatoDelTexto.parse(request.getParameter("fecha"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		record.setFechanacimiento(fecha);
		record.setPerfil("Usuario");
		registroUsuarioVo = new RegistroUsuarioVo(record);
		try{
			registroUsuarioVo.guardarUsuario();
		}catch(Exception e){
			e.printStackTrace();
		}
		PrintWriter io = response.getWriter();
		io.println("<html>");
		io.println("<h1> Guardado exitosamente </h1>");
		io.println("</html>");
	}

}
