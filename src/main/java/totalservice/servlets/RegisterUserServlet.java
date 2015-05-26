package totalservice.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.http.HttpServerConnection;

import com.amazonaws.services.datapipeline.model.ValidationError;

import totalservice.data.base.DataProviderImplement;
import totalservice.models.user.User;
import totalservice.utilities.ValidationException;

public class RegisterUserServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");			
		
		

	      // Actual logic goes here.
		request.setAttribute("title", "Login");			
		request.getRequestDispatcher("/WEB-INF/RegisterUser.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("first_name");
		String surname = request.getParameter("last_name");
		String email = request.getParameter("email");
		String telephone = request.getParameter("telephone");
		String passwrd = request.getParameter("passwrd");
		
		User incomingUser = new User();
		incomingUser.setName(name);
		incomingUser.setSername(surname);
		
		try {
			incomingUser.setTelephoneNom(telephone);
		} catch (ValidationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			incomingUser.setEmail(email);
		} catch (ValidationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		incomingUser.setPasswrd(passwrd);
		
		PrintWriter writer = response.getWriter();
		
		String htmlResponse ;
		
		htmlResponse = name + surname + email + telephone;
		
		DataProviderImplement dp = new DataProviderImplement().getInstance();
		
		List<User> currUsers = new ArrayList<User>();
		
		try {
			currUsers = dp.selectUsers("");
			if(currUsers.contains(incomingUser)){
				
				writer.println("User already exists!");
			}
			else{
				incomingUser.setId(currUsers.size() + 1);
				dp.addUser(incomingUser);
				
				
				writer.println("Operation succesfull!");
			}
		} catch (ValidationException e1){
			// TODO Auto-generated catch block
			e1.printStackTrace();
			writer.println(e1.getMessage());
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			writer.println(e.getMessage());
		}
		
		writer.println(htmlResponse);
	}


}