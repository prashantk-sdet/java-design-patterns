package structural.adapter;

public class EmployeeAdapterCSV implements Employee {
	
	EmployeeCSV instance;
	
	public EmployeeAdapterCSV(EmployeeCSV instance) {
		this.instance = instance;
	}

	@Override
	public String getId() {
		return instance.getId() + "";
	}

	@Override
	public String getFirstName() {
		return instance.getFirstName();
	}

	@Override
	public String getLastName() {
		return instance.getLastName();
	}

	@Override
	public String getEmail() {
		return instance.getEmail();
	}
	
	@Override
	public String toString() {
		String out = "ID: " + instance.getId() + ", ";
		out = out + "First Name: " + instance.getFirstName() + ", ";
		out = out + "Last Name: " + instance.getLastName() + ", ";
		out = out + "Email: " + instance.getEmail();
		
		return out;
		
	}

}
