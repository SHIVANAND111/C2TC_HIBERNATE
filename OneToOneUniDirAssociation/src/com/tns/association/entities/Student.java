package com.tns.association.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="student")

public class Student {
@Id

@GeneratedValue(strategy=GenerationType.AUTO)
private int sid;
private String sname;

@OneToOne(cascade=CascadeType.ALL)
@JoinColumn(name="addressid")
private Address address;

public Student(int sid, String sname, Address address) {
	this.sid = sid;
	this.sname = sname;
	this.address = address;
}

public Student() {
	// TODO Auto-generated constructor stub
}

public int getSid() {
	return sid;
}

public void setSid(int sid) {
	this.sid = sid;
}

public String getSname() {
	return sname;
}

public void setSname(String sname) {
	this.sname = sname;
}

public Address getAddress() {
	return address;
}

public void setAddress(Address address) {
	this.address = address;
}




}
