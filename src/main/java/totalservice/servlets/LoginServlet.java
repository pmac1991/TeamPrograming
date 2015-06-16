package totalservice.servlets;



	import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
		
	public class LoginServlet extends HttpServlet {
		
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			response.setContentType("text/html");			
			String error = request.getParameter("loginError");
			request.setAttribute("loginError", error);

		      // Actual logic goes here.
			request.setAttribute("title", "Login");			
			request.getRequestDispatcher("/WEB-INF/Login.jsp").forward(request, response);
		}

		/**
		 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			final HttpServletRequest httpRequest = (HttpServletRequest) request;
			String login = httpRequest.getParameter("login");
			String pass = httpRequest.getParameter("password");
			if("admin".equals(login) && "admin".equals(pass)){
				response.sendRedirect("/TotalService/firms");
			} else{
				request.setAttribute("loginError", "Invalid login or password");	
				response.sendRedirect("/TotalService/login");
			}
		}


	}