package hrmsapp.dao;

import hrms.exception.EmployeeNotFoundException;
import hrmsapp.model.Employee;

public interface EmployeeDAO {
	//create
	public Employee addEmployee(Employee employee) throws EmployeeNotFoundException;
	//Retrieve
	public Employee getEmployeeId(Integer id) throws EmployeeNotFoundException;
	//update
	public Employee updateEmployee(Employee employee) throws EmployeeNotFoundException;
	//delete
	public String deleteEmployee(Integer id) throws EmployeeNotFoundException;
	
	public Employee getEmployeeById(Integer id) throws EmployeeNotFoundException;

}
