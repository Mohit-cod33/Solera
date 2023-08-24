package hrms.services;

import hrms.exception.EmployeeNotFoundException;
import hrmsapp.model.Employee;

public interface EmployeeService {
	//create
		public Employee addEmployee(Employee employee) throws EmployeeNotFoundException;
		//Retrieve
		public Employee getEmployeeId(Integer id) throws EmployeeNotFoundException;
		//update
		public Employee updateEmployee(Employee employee) throws EmployeeNotFoundException;
		//delete
		public String deleteEmployee(Integer id) throws EmployeeNotFoundException;
		Employee getEmployeeById(Integer id) throws EmployeeNotFoundException;


}
