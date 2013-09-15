package co.edu.uniminuto.gymsoft.persistence.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.edu.uniminuto.gymsoft.persistence.model.Actividad;

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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter io = response.getWriter();
		String usuarios[];
		usuarios= request.getParameterValues("usuarios");
		
		
		Actividad actividad = new Actividad();
		
		//Formatea parámetros Strings.
		actividad.setTipo(request.getParameter("actividadSelect"));
		actividad.setLugarFisico(request.getParameter("lugarFisicoSelect"));
		
		//Formatea la fecha que ingresa.
		Date fechaEscogida=null;
		SimpleDateFormat formateador= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			fechaEscogida=formateador.parse(request.getParameter("fecha"));
			actividad.setFecha(fechaEscogida);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//Almacenar el registro de la nueva Actividad.
		try{
			
		}catch(Exception e){
			e.printStackTrace();
		}

		
		
		
	}

}
