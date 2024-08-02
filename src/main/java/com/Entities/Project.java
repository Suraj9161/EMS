package com.Entities;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "projects")
public class Project {

	



	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String name;
	
	@ManyToMany(mappedBy = "projects")
	private Set<Employee> employees=new  HashSet<>();
	
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Project( String name, Set<Employee> employees) {
		super();
		
		this.name = name;
		this.employees = employees;
	}



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Set<Employee> getEmployees() {
		return employees;
	}



	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}



	@Override
	public String toString() {
		return "Project [id=" + id + ", name=" + name + ", employees=" + employees + "]";
	}
	
	
}
