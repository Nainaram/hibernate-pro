package com.ram.hib.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
//import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name ="projects")
public class Projects {
	
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Column(name ="pid")
		private int pid;
		@Column(name ="pname")
		private String pname;
		@Column(name ="noOfHours")
		private int noOfHours;
		@Column(name ="marks")
		private int marks;
			
		@ManyToMany(cascade = CascadeType.ALL,mappedBy = "projectsList",fetch = FetchType.EAGER)
		private List<StudentDemo> studentdemo;
		
		
		
		
		
		
		public List<StudentDemo> getStudentdemo() {
			return studentdemo;
		}
		public void setStudentdemo(List<StudentDemo> studentdemo) {
			this.studentdemo = studentdemo;
		}
		public Projects() {
			super();
		}
		public Projects(String pname, int noOfHours, int marks) {
			super();
			this.pname = pname;
			this.noOfHours = noOfHours;
			this.marks = marks;
		}
		public Projects(int pid, String pname, int noOfHours, int marks) {
			super();
			this.pid = pid;
			this.pname = pname;
			this.noOfHours = noOfHours;
			this.marks = marks;
		}
		public int getPid() {
			return pid;
		}
		public void setPid(int pid) {
			this.pid = pid;
		}
		public String getPname() {
			return pname;
		}
		public void setPname(String pname) {
			this.pname = pname;
		}
		public int getNoOfHours() {
			return noOfHours;
		}
		public void setNoOfHours(int noOfHours) {
			this.noOfHours = noOfHours;
		}
		public int getMarks() {
			return marks;
		}
		public void setMarks(int marks) {
			this.marks = marks;
		}
		@Override
		public String toString() {
			return  pid +" " + pname + " " + noOfHours + " " + marks +" "+studentdemo.;
		}
		
}
