package com.Entities;

import java.util.HashSet;
import java.util.Set;

import jakarta.annotation.Nonnull;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Employees")
public class Employee {
	  
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "name")
	@Nonnull
	private String name;
	
	@Column(name = "email")
	@Nonnull
	private String email;
	
	@ManyToOne
	@JoinColumn(name = "department_id")
	private Department department;

	@ManyToMany(cascade = {CascadeType.ALL})
	@JoinTable(
			name = "Employee_Project",
			joinColumns = {@JoinColumn(name="employee_id")},
			inverseJoinColumns = {@JoinColumn(name="project_id")}
			)
	private Set<Project>projects=new HashSet<>();

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, String email, Department department, Set<Project> projects) {
		super();
		this.name = name;
		this.email = email;
		this.department = department;
		this.projects = projects;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Set<Project> getProjects() {
		return projects;
	}

	public void setProjects(Set<Project> projects) {
		this.projects = projects;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", department=" + department
				+ ", projects=" + projects + "]";
	}
	
	
	
	
}
