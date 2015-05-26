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
import totalservice.utilities.ValidationException;

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
	
	public List<User> selectUsers(String query) throws SQLException, ValidationException {
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
	public User loginUser() {
		
		return null;
	}

	public boolean addUser(User user) throws SQLException {
		// TODO Auto-generated method stub
		
		String query = "insert into totalservice.users values( " + Integer.toString(user.getId()) + 
				", '" + user.getName() + "', '" + user.getSername() + "', '" + user.getEmail() + "', '" + user.getPasswrd() + "', '"
				+ user.getTelephoneNom() + "', " + "0 " + ");";//user.getDateOfBorn().toString() + ");";
		Statement statement = connection.createStatement();
		//ResultSet resultSet = statement.executeQuery(query);
		statement.executeUpdate(query);
		return true;
	}
	public boolean editUser(User user, int id) {
		// TODO Auto-generated method stub
		return false;
	}
	public void deletUser(int id) {
		// TODO Auto-generated method stub
		
	}
	public List<Firm> selectFirms(String query) throws SQLException, ValidationException {
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
		return firms;
	}
	public boolean addFirm(Firm firm) throws SQLException {
		String query = "insert into totalservice.firms values( " + Integer.toString(firm.getId()) + 
				", '" + firm.getName() + "', '" + firm.getEmail() + "', '" + firm.getPassword() + "', '" + firm.getTelephone() + "', '" +
				 firm.getAddress() + "', '" + firm.getBranch() + "', '" + firm.getDescription() + "', " +   "0 );";
		Statement statement = connection.createStatement();
		//ResultSet resultSet = statement.executeQuery(query);
		int resultSet = statement.executeUpdate(query);
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
