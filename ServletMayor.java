package com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class ServletMayor
 */
public class ServletMayor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletMayor() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int elMayor=0;

		int num1=Integer.parseInt(request.getParameter("num1")) ;
		int num2=Integer.parseInt(request.getParameter("num2")) ;
		int num3=Integer.parseInt(request.getParameter("num3")) ;
		
		if(num1>num2 && num1>num3) {
			elMayornum1;
		PrintWriter out = response.getWriter();
	     out.println("El mayor de los tres es el numero: " + elMayor);
		}
		else if(num2>num1 && num1>num3) {
			elMayor=num2;
		PrintWriter out = response.getWriter();
	     out.println("El mayor de los tres es el numero: " + elMayor);
		}
		else if(num3>num2 && num3>num1) {
			elMayor=num3;
		PrintWriter out = response.getWriter();
	     out.println("El mayor de los tres es el numero: " + elMayor);
		}
		else {
			PrintWriter out = response.getWriter();
		     out.println("Los numeros son iguales"); 
		     
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
