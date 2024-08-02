package com.DAOs;

import org.hibernate.Session;


import com.Configuration.HibernateUtil;
import com.Entities.Department;


public class DepartmentDao {

	public void saveDepartment(Department department) {
		Session session=HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(department);
		session.getTransaction().commit();
		session.close();
	}
	   public Department getDepartment(Long id) {
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        Department department = session.get(Department.class, id);
	        session.close();
	        return department;
	    }
}
