
package totalservice.models.user;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import totalservice.utilities.*;

public class User {
	private String name;
	private String sername;
	private Date dateOfBorn;
	private String telephoneNom;
	private String email;
	private int id;
	private String passwrd;
	
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
	public String getSername() {
		return sername;
	}
	public void setSername(String sername) {
		this.sername = sername;
	}
	public Date getDateOfBorn() {
		return dateOfBorn;
	}
	public void setDateOfBorn(Date dateOfBorn) {
		this.dateOfBorn = dateOfBorn;
	}
	public String getTelephoneNom() {
		return telephoneNom;
	}
	public void setTelephoneNom(String telephoneNom) throws ValidationException {
		if(validateTelephone(telephoneNom)){
			this.telephoneNom = telephoneNom;
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
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	
	public String getPasswrd() {
		return passwrd;
	}
	public void setPasswrd(String passwrd) {
		this.passwrd = passwrd;
	}

	
	
}
