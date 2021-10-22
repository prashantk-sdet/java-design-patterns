package structural.adapter;

public class EmployeeAdapterLDAP implements Employee {
	
	EmployeeLDAP instance;
	
	public EmployeeAdapterLDAP(EmployeeLDAP instance) {
		this.instance = instance;
	}

	@Override
	public String getId() {
		return instance.getCn();
	}

	@Override
	public String getFirstName() {
		return instance.getGivenName();
	}

	@Override
	public String getLastName() {
		return instance.getSurName();
	}

	@Override
	public String getEmail() {
		return instance.getMail();
	}
	
	@Override
	public String toString() {
		String out = "ID: " + instance.getCn() + ", ";
		out = out + "First Name: " + instance.getGivenName() + ", ";
		out = out + "Last Name: " + instance.getSurName() + ", ";
		out = out + "Email: " + instance.getMail();
		
		return out;
		
	}

}
