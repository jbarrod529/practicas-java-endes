package com;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class DiaSemanaServlet
 */
public class DiaSemanaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DiaSemanaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int dia=Integer.parseInt(request.getParameter("dia"));	
		switch (dia) {
		case 1:

			PrintWriter out = response.getWriter();
		     out.println("El dia de la semana es Lunes");break;

		case 2:

			PrintWriter out2= response.getWriter();
		     out2.println("El dia de la semana es Martes");break;

		case 3:

			PrintWriter out3= response.getWriter();
		     out3.println("El dia de la semana es Miércoles");break;

		case 4:

			PrintWriter out8= response.getWriter();
		     out8.println("El dia de la semana es Jueves"); break;

		case 5:

			PrintWriter out4 = response.getWriter();
		     out4.println("El dia de la semana es Viernes");break;

		case 6:

			PrintWriter out5 = response.getWriter();
		     out5.println("El dia de la semana es Sábado");break;

		case 7:

			PrintWriter out6 = response.getWriter();
		     out6.println("Domingo");break;
		
		
		}
		 
		     
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
