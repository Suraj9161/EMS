package com.Services;

import com.DAOs.EmployeeDao;
import com.Entities.Employee;

public class EmployeeService {
	 private EmployeeDao employeeDao = new EmployeeDao();

	    public void createEmployee(Employee employee) {
	        employeeDao.saveEmployee(employee);
	    }

	    public Employee findEmployeeById(Long id) {
	        return employeeDao.getEmployee(id);
	    }
}
