package com.ram.hib.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="subjects")
public class Subjects {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="subId")
	private int subId;
	@Column(name="subName")
	private String subName;
	@Column(name="noOfHrs")
	private int noOfHrs;
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name="studentid")
	private StudentDemo student;
	public StudentDemo getStudent() {
		return student;
	}
	public void setStudent(StudentDemo student) {
		this.student = student;
	}
	public Subjects() {
		super();
	}
	public Subjects(String subName, int noOfHrs) {
		super();
		this.subName = subName;
		this.noOfHrs = noOfHrs;
	}
	public Subjects(int subId, String subName, int noOfHrs) {
		super();
		this.subId = subId;
		this.subName = subName;
		this.noOfHrs = noOfHrs;
	}
	public int getSubId() {
		return subId;
	}
	public void setSubId(int subId) {
		this.subId = subId;
	}
	public String getSubName() {
		return subName;
	}
	public void setSubName(String subName) {
		this.subName = subName;
	}
	public int getNoOfHrs() {
		return noOfHrs;
	}
	public void setNoOfHrs(int noOfHrs) {
		this.noOfHrs = noOfHrs;
	}
	@Override
	public String toString() {
		return  subId + " " + subName + " " + noOfHrs+" "+student.getSid();
	}
	
}
