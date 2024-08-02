package com.Services;

import com.DAOs.DepartmentDao;
import com.Entities.Department;

public class DepartmentService {
	   private DepartmentDao departmentDao = new DepartmentDao();

	    public void createDepartment(Department department) {
	        departmentDao.saveDepartment(department);
	    }

	    public Department findDepartmentById(Long id) {
	        return departmentDao.getDepartment(id);
	    }
}
