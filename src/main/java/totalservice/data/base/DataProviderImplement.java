package totalservice.data.base;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import totalservice.models.firm.Firm;
import totalservice.models.user.User;

public class DataProviderImplement implements DataProvider {
	private static String URL = "jdbc:mysql://localhost:3306/totalservice";
	private static String USER = "root";
	private static String PASS = "root";
	private static Connection connection = null;
	private static  DataProviderImplement dataProviderImplement;
	
	
	
	public List<User> selectUser(String query) {
		// TODO Auto-generated method stub
		return null;
	}
	public boolean addUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}
	public boolean editUser(User user, int id) {
		// TODO Auto-generated method stub
		return false;
	}
	public void deletUser(int id) {
		// TODO Auto-generated method stub
		
	}
	public List<Firm> selectFirm(String query) {
		List<Firm> firms = new ArrayList<Firm>();
		Firm firm = new Firm();
		Firm firm1 = new Firm();
		Firm firm2 = new Firm();
//		query="select * from totalservice.firms";
//		Statement statement = connection.createStatement();
//		ResultSet resultSet = statement.executeQuery(query);
		firm.setAddress("Lodz Kaliska");
		firm.setBranch("car fix");
		firm.setDescription("the best");
		firm.setEmail("email@email.com");
		firm.setName("CARDENTE");		
		firm.setRate(5);
		firm.setTelephone("11111111111");
		firms.add(firm);
		firm1.setAddress("Lodz Inne");
		firm1.setBranch("car crash");
		firm1.setDescription("the best of the best");
		firm1.setEmail("car@crash.com");
		firm1.setName("Destract");		
		firm1.setRate(5);
		firm1.setTelephone("22222222222");
		firms.add(firm1);
		firm2.setAddress("Lodz");
		firm2.setBranch("car car");
		firm2.setDescription("the best of the best of the best");
		firm2.setEmail("best@best.com");
		firm2.setName("Krow");		
		firm2.setRate(5);
		firm2.setTelephone("33333333333333333");
		firms.add(firm2);
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
