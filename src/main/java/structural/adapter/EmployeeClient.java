package structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {
	
	public List<Employee> getEmployeeList(){
		
		List<Employee> employees = new ArrayList<Employee>();
		
		Employee employeeDB = new EmployeeDB("1","john","wick","john@wick.com");
		
		employees.add(employeeDB);
		
		EmployeeLDAP employeeLDAP = new EmployeeLDAP("2","tom","cruise","tom@cruise.com");
		
		EmployeeAdapterLDAP  employeeAdapterLDAP = new EmployeeAdapterLDAP(employeeLDAP);
		
		employees.add(employeeAdapterLDAP);
		
		EmployeeCSV employeeCSV = new EmployeeCSV("3,Tom,Hanks,tom@hanks.com");
		EmployeeAdapterCSV  employeeAdapterCSV = new EmployeeAdapterCSV(employeeCSV);
		
		employees.add(employeeAdapterCSV);
		
		return employees;
		
	}
	
	

}
