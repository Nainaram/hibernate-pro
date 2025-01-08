package com.ram.hib.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name ="StudentDemo")
public class StudentDemo {
	@Id
	@Column(name="sid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int sid;
	@Column(name="name")
	private String name;
	@Column(name="email")
	private String email;
	@Column(name="address")
	private String address;
	@Column(name="pincode")
	private  int pincode;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="studentdetail")
	private StudentDetail studentdetail;
	
	@OneToMany(mappedBy = "student",cascade = CascadeType.ALL)
	private List<Subjects> subjects;
	
	public List<Subjects> getSubjects() {
		return subjects;
	}
	public void setSubjects(List<Subjects> subjects) {
		this.subjects = subjects;
	}
	public StudentDetail getStudentdetail() {
		return studentdetail;
	}
	public void setStudentdetail(StudentDetail studentdetail) {
		this.studentdetail = studentdetail;
	}
	public StudentDemo() {
		super();
	}
	public StudentDemo(String name, String email, String address, int pincode) {
		super();
		this.name = name;
		this.email = email;
		this.address = address;
		this.pincode = pincode;
	}
	public StudentDemo(int sid, String name, String email, String address, int pincode) {
		super();
		this.sid = sid;
		this.name = name;
		this.email = email;
		this.address = address;
		this.pincode = pincode;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return  sid + "  " + name + "  " + email + " " + address + "  "
				+ pincode ;
	}
	
	
	
}
