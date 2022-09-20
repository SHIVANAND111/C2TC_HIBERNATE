package com.tns.jpastart.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="dept_master")
public class Department implements Serializable {
	
private static final long serialVersionUID = 1L;
	
	@Id
	private int id;
	
	private String name;
	
	@OneToMany( mappedBy ="department",cascade=CascadeType.ALL)
	private	Set<Employee> employees= new HashSet<>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public Department(int id, String name, Set<Employee> employees) {
	
		this.id = id;
		this.name = name;
		this.employees = employees;
	}

	
	public Department() {

	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", employees=" + employees + "]";
	}

	public void addEmployee(Employee employee1) {
		// TODO Auto-generated method stub
		
	}
	

}
