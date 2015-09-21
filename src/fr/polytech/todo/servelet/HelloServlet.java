package fr.polytech.todo.servelet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/Hello")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out=response.getWriter();
		String name =request.getParameter("name");
	    RequestDispatcher dispatcher =  request.getRequestDispatcher("hello.jsp");
	    dispatcher.forward( request, response ); /*
		out.println("<!DOCTYPE html!>");
		out.println("<html><head><meta charset=\"utf-8\"/>");
		out.println("<title>TEST</title>");
	
		out.println("</head>");
		out.println("<body>");
		out.println("Hello world"+name);
		out.println("</body>");		
		out.println("</html>");*/

		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    String fn= request.getParameter("first_name");
        String ln = request.getParameter("last_name");
        String message=null;
        if ((ln.equals("Selenia")) && (fn.equals("Nathalie"))) {
            message = "BINGO...";
        } else {
            message = "Try again";
        }

        request.setAttribute("message", message);
        RequestDispatcher dispatcher =  request.getRequestDispatcher("hello.jsp");
	    dispatcher.forward( request, response );	}

}
