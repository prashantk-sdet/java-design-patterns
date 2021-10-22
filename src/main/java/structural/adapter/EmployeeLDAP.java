package structural.adapter;

public class EmployeeLDAP {
	
	private String cn;
	private String givenName;
	private String surName;
	private String mail;
	
	
	
	public EmployeeLDAP(String cn, String givenName, String surName, String mail) {
		super();
		this.cn = cn;
		this.givenName = givenName;
		this.surName = surName;
		this.mail = mail;
	}

	public String getCn() {
		return cn;
	}
	
	public String getGivenName() {
		return givenName;
	}
	
	public String getSurName() {
		return surName;
	}
	
	public String getMail() {
		return mail;
	}
	
	

}
