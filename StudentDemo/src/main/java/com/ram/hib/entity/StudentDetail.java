package com.ram.hib.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="studentDetail")
public class StudentDetail {

			@Id
			@Column(name="sdid")
			@GeneratedValue(strategy = GenerationType.AUTO)
			private int sdid;
			@Column(name="mobile")
			private int mobile;
			@Column(name="city")
			private String city;
			@Column(name="state")
			private String state;
			@OneToOne(mappedBy = "studentdetail"  ,cascade = CascadeType.ALL)
			private StudentDemo studentdemo;
			
			
			public StudentDemo getStudentdemo() {
				return studentdemo;
			}
			public void setStudentdemo(StudentDemo studentdemo) {
				this.studentdemo = studentdemo;
			}
			public StudentDetail(int sdid, int mobile, String city, String state) {
				super();
				this.sdid = sdid;
				this.mobile = mobile;
				this.city = city;
				this.state = state;
			}
			public StudentDetail() {
				super();
			}
			public StudentDetail(int mobile, String city, String state) {
				
				this.mobile = mobile;
				this.city = city;
				this.state = state;
			}
			public int getSdid() {
				return sdid;
			}
			public void setSdid(int sdid) {
				this.sdid = sdid;
			}
			public int getMobile() {
				return mobile;
			}
			public void setMobile(int mobile) {
				this.mobile = mobile;
			}
			public String getCity() {
				return city;
			}
			public void setCity(String city) {
				this.city = city;
			}
			public String getState() {
				return state;
			}
			public void setState(String state) {
				this.state = state;
			}
			@Override
			public String toString() {
				return  sdid + "  " + mobile + "   " + city + "  " + state ;
			}
			
}
