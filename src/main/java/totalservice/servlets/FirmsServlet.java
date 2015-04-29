package totalservice.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import totalservice.data.base.DataProviderImplement;
		
public class FirmsServlet  extends HttpServlet {
		
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			DataProviderImplement dpi = new DataProviderImplement();
			response.setContentType("text/html");
			request.setAttribute("firms", dpi.selectFirm(""));
		      						
			request.getRequestDispatcher("/WEB-INF/AllFirms.jsp").forward(request, response);
		}

		/**
		 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
		}


	}