package com.DAOs;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import com.Configuration.HibernateUtil;
import com.Entities.Employee;

public class EmployeeDao {

	public void saveEmployee(Employee employee) {
		Session session=HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(employee);
		session.getTransaction().commit();
		session.close();
	}
	public Employee getEmployee(Long id) {
		
		Session session=HibernateUtil.getSessionFactory().openSession();
		Employee employee=session.get(Employee.class, id);
		session.close();
		return employee;
		
	}
	public  Employee updatEmployee(Long id , Employee updatEmployees) {
		Session session=HibernateUtil.getSessionFactory().openSession();
		Employee employee=session.get(Employee.class, id);
		try {
			if(employee!=null) {
				employee.setName(updatEmployees.getName());
				employee.setEmail(updatEmployees.getEmail());
				session.update(employee);
			}
			
			session.getTransaction().commit();
		} catch (Exception e) {
			session.close();
		}
		
		return employee;
		
	}
}
