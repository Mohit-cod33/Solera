package hrms.services;

import hrms.exception.EmployeeNotFoundException;
import hrmsapp.dao.EmployeeDAO;
import hrmsapp.dao.EmployeeDaoImpl;
import hrmsapp.model.Employee;

public class EmployeeServiceImpl implements EmployeeService{

	@Override
	public Employee addEmployee(Employee employee) throws EmployeeNotFoundException {
		EmployeeDAO employeeDao = new EmployeeDaoImpl();
		Employee emp = employeeDao.addEmployee(employee);
		//If you want to do certain other operation after adding employee you can write the logic
		return emp;
	}

	@Override
	public Employee getEmployeeById(Integer id) throws EmployeeNotFoundException {
		EmployeeDAO employeeDao = new EmployeeDaoImpl();
		
		return employeeDao.getEmployeeById(id);
	}

	@Override
	public Employee updateEmployee(Employee employee) throws EmployeeNotFoundException {
		EmployeeDAO employeeDao = new EmployeeDaoImpl();
		return employeeDao.updateEmployee(employee);
	}

	@Override
	public String deleteEmployee(Integer id) throws EmployeeNotFoundException {
		EmployeeDAO employeeDao = new EmployeeDaoImpl();
		return employeeDao.deleteEmployee(id);
	}

	@Override
	public Employee getEmployeeId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
