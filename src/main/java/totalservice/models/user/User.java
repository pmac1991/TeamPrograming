package totalservice.models.user;

import java.util.Date;

public class User {
	private String name;
	private String sername;
	private Date dateOfBorn;
	private String telephoneNom;
	private int id;
	
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

	
	
}
