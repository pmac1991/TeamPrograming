package totalservice.data.base;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import totalservice.models.firm.Firm;
import totalservice.models.user.User;

public class DataProviderImplement implements DataProvider {
	private static String URL = "jdbc:mysql://localhost:3306/totalservice";
	private static String USER = "root";
	private static String PASS = "weeia1991";
	private static Connection connection = null;
	private static  DataProviderImplement dataProviderImplement;
	
	public static DataProviderImplement getInstance()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			connection = DriverManager.getConnection(URL, USER, PASS);			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (dataProviderImplement == null) {
			dataProviderImplement = new DataProviderImplement();
		}

		
		return dataProviderImplement;
	}
	
	public List<User> selectUser(String query) throws SQLException {
		// TODO Auto-generated method stub
		List<User> result = new ArrayList<User>();
		
		query="select * from totalservice.users";
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(query);
		
        while (resultSet.next()) {
        	int ID = resultSet.getInt("iduser");
            String name = resultSet.getString("name");
            String surname = resultSet.getString("sername");
            String telephoneNum = resultSet.getString("telephone");
//            String dateOfBirth = resultSet.getString("");
            String email = resultSet.getString("email");
            String passwrd = resultSet.getString("password");
            
            User tempUs = new User();
            
            tempUs.setId(ID);
            tempUs.setName(name);
            tempUs.setSername(surname);
            tempUs.setTelephoneNom(telephoneNum);
            tempUs.setEmail(email);
            tempUs.setPasswrd(passwrd);
            
            result.add(tempUs);
            
        }
		
		return result;
	}
	public boolean addUser(User user) throws SQLException {
		// TODO Auto-generated method stub
		
		String query = "insert into totalservice.users values(" + Integer.toString(user.getId()) + 
				" " + user.getName() + " " + user.getSername() + " " + user.getEmail() + " " + user.getPasswrd() + ""
				+ user.getTelephoneNom() + " " + user.getDateOfBorn() + ");";
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(query);
		
		return false;
	}
	public boolean editUser(User user, int id) {
		// TODO Auto-generated method stub
		return false;
	}
	public void deletUser(int id) {
		// TODO Auto-generated method stub
		
	}
	public List<Firm> selectFirm(String query) throws SQLException {
		List<Firm> firms = new ArrayList<Firm>();
		
		Firm firm1 = new Firm();
		Firm firm2 = new Firm();
		
		query="select * from totalservice.firms";
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(query);
		try {
        while (resultSet.next()) {        	
            
            Firm firm = new Firm();
            
            firm.setAddress("Lodz Kaliska");
    		firm.setBranch("car fix");
    		firm.setDescription("the best");
    		
				firm.setEmail(resultSet.getString("email").toString());
			
    		firm.setName(resultSet.getString("name"));		
    		firm.setRate(5);
    		firm.setTelephone(resultSet.getString("telephone"));
            
    		firms.add(firm);
            
        }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		query="select * from totalservice.firms";
//		Statement statement = connection.createStatement();
//		ResultSet resultSet = statement.executeQuery(query);
		
//		firms.add(firm);
//		firm1.setAddress("Lodz Inne");
//		firm1.setBranch("car crash");
//		firm1.setDescription("the best of the best");
//		firm1.setEmail("car@crash.com");
//		firm1.setName("Destract");		
//		firm1.setRate(5);
//		firm1.setTelephone("22222222222");
//		firms.add(firm1);
//		firm2.setAddress("Lodz");
//		firm2.setBranch("car car");
//		firm2.setDescription("the best of the best of the best");
//		firm2.setEmail("best@best.com");
//		firm2.setName("Krow");		
//		firm2.setRate(5);
//		firm2.setTelephone("33333333333333333");
//		firms.add(firm2);
		return firms;
	}
	public boolean addFirm(Firm user) {
		// TODO Auto-generated method stub
		return false;
	}
	public boolean editFirm(Firm user, int id) {
		// TODO Auto-generated method stub
		return false;
	}
	public void deletFirm(int id) {
		// TODO Auto-generated method stub
		
	}
	
	
}
