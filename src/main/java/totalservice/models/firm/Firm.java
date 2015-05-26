
package totalservice.models.firm;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import totalservice.utilities.ValidationException;

public class Firm {
	
	private int Id;
	private String name;
	private String email;
	private String password;
	private String telephone;
	private String address;
	private String branch;
	private String description;
	private int rate;
	
	private Pattern pattern;
	private Matcher matcher;
 
	private static final String EMAIL_PATTERN = 
		"^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
		+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	
	private static final String TELEPHONE_PATTERN = 
			"^([0-9]{9})|(([0-9]{3}-){2}[0-9]{3})$";
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) throws ValidationException {
		
		if(validateEmail(email)){
			this.email = email;	
		}
		else{
			throw new ValidationException("email");
		}		
	}
	
	private boolean validateEmail(final String hex) { 
		pattern = Pattern.compile(EMAIL_PATTERN);
		matcher = pattern.matcher(hex);
		return matcher.matches();
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTelephone() {
		return telephone;
	}
	
	public void setTelephone(String telephoneNom) throws ValidationException {
		if(validateTelephone(telephoneNom)){
			this.telephone = telephoneNom;
		}
		else{
			throw new ValidationException("telephone");
		}	
	}
	private boolean validateTelephone(final String hex) { 
		pattern = Pattern.compile(TELEPHONE_PATTERN);
		matcher = pattern.matcher(hex);
		return matcher.matches();
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	 
	 
	 
}
