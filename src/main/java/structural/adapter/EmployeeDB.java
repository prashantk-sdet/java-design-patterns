package structural.adapter;

public class EmployeeDB implements Employee {
	
	String id;
	String firstName;
	String lastName;
	String email;
	
	

	public EmployeeDB(String id, String firstName, String lastName, String email) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	@Override
	public String getId() {
		return id;
	}

	@Override
	public String getFirstName() {
		return firstName;
	}

	@Override
	public String getLastName() {
		return lastName;
	}

	@Override
	public String getEmail() {
		return email;
	}
	
	@Override
	public String toString() {
		String out = "ID: " + id + ", ";
		out = out + "First Name: " + firstName + ", ";
		out = out + "Last Name: " + lastName + ", ";
		out = out + "Email: " + email;
		
		return out;
		
	}

}
