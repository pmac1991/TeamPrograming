
package totalservice.servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import totalservice.data.base.DataProviderImplement;
import totalservice.models.user.User;
		
public class FirmsServlet  extends HttpServlet {
		
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			DataProviderImplement dpi = new DataProviderImplement().getInstance();
			//response.setContentType("text/html");
			
			try {
				request.setAttribute("firms", dpi.selectFirms(""));
				//List<User> users=dpi.selectUser("");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}						
			request.getRequestDispatcher("/WEB-INF/AllFirms.jsp").forward(request, response);
		}

		/**
		 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
		}


	}