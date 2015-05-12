package totalservice.models.user;

import java.util.Date;

public class User {
	private String name;
	private String sername;
	private Date dateOfBorn;
	private String telephoneNom;
	private String email;
	private int id;
	private String passwrd;
	
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
	public void setTelephoneNom(String telephoneNom) {
		this.telephoneNom = telephoneNom;
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
	public void setEmail(String email) {
		
		//TODO add email regex here !!!!
		this.email = email;
	}
	public String getPasswrd() {
		return passwrd;
	}
	public void setPasswrd(String passwrd) {
		this.passwrd = passwrd;
	}

	
	
}
