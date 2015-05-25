package TotalService.TotalService;

import java.sql.SQLException;
import java.util.logging.Logger;

import org.junit.Test;

import static org.junit.Assert.*;
import totalservice.data.base.DataProviderImplement;
import totalservice.models.firm.Firm;
import totalservice.models.user.User;
import junit.framework.Assert;
public class UserTest {
	
	private static final long seriaVersionUID =1L;
	private static final Logger logger = Logger.getLogger(UserTest.class.getName());
	
	@Test
	public void test1() {
		User testUser = new User();
		DataProviderImplement dpi = new DataProviderImplement().getInstance();		
			try {
				assertEquals(true,dpi.addUser(testUser));
				testUser.setName("Jim");
				testUser.setSername("Kerry");
//				dpi.addUser(testUser);
				assertEquals(true,dpi.addUser(testUser));
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				assert(false);
			}
	}
	
	@Test
	public void test2() {
		Firm testFirm = new Firm();
		DataProviderImplement dpi = new DataProviderImplement().getInstance();		
			try {
				assert(dpi.addFirm(testFirm));
				testFirm.setName("Lok");
				testFirm.setPassword("password");
//				dpi.addFirm(testFirm);
				assert(dpi.addFirm(testFirm));
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				assert(false);
			}
	}

}
