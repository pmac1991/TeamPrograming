package totalservice.data.base;

import java.sql.SQLException;
import java.util.List;

import totalservice.models.firm.Firm;
import totalservice.models.user.User;

public interface DataProvider {

	public List<User> selectUser(String query) throws SQLException;
	boolean addUser(User user) throws SQLException;
	boolean editUser(User user,int id);
	public void deletUser(int id);
	
	public List<Firm> selectFirm(String query);
	boolean addFirm(Firm user);
	boolean editFirm(Firm user,int id);
	public void deletFirm(int id);

}
