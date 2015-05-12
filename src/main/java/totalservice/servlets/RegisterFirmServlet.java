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

import totalservice.data.base.DataProviderImplement;
import totalservice.models.firm.Firm;
import totalservice.models.user.User;

public class RegisterFirmServlet  extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");			
		
		

	      // Actual logic goes here.
		request.setAttribute("title", "Login");			
		request.getRequestDispatcher("/WEB-INF/RegisterFirm.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String telephone = request.getParameter("telephone");
		String passwrd = request.getParameter("passwrd");
		String address = request.getParameter("address");
		String branch = request.getParameter("branch");
		String description = request.getParameter("description");
		
		Firm incomingFirm = new Firm();
		incomingFirm.setName(name);
		incomingFirm.setEmail(email);
		incomingFirm.setTelephone(telephone);
		incomingFirm.setPassword(passwrd);
		incomingFirm.setAddress(address);
		incomingFirm.setBranch(branch);
		incomingFirm.setDescription(description);
		
		PrintWriter writer = response.getWriter();
		
		String htmlResponse ;
		
		DataProviderImplement dp = new DataProviderImplement().getInstance();
		
		List<Firm> currFirms = new ArrayList<Firm>();
		
		try {
			currFirms = dp.selectFirm("");
			if(currFirms.contains(incomingFirm)){
				
				writer.println("User already exists!");
			}
			else{
				
				
				writer.println("Operation succesfull!");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			writer.println(e.getMessage());
		}	
		
	}

}