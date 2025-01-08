package com.ram.hib.main;

import java.util.ArrayList;
import java.util.List;

import com.ram.hib.DAOImpl.StudentDemoDAOImpl;
import com.ram.hib.entity.StudentDemo;
import com.ram.hib.entity.StudentDetail;
import com.ram.hib.entity.Subjects;

public class Main {
	private static StudentDemoDAOImpl hdaoi;
	private static ArrayList<StudentDemo> slist;

	public static void main(String[] args) {
					hdaoi = new StudentDemoDAOImpl();
					
					List<Subjects> subList1 = new ArrayList();
					List<Subjects> subList2 = new ArrayList();
					Subjects sub1 = new Subjects("HTML",5); 
					Subjects sub2 = new Subjects("css",1); 
					Subjects sub3 = new Subjects("javascript",2); 
					Subjects sub4 = new Subjects("jdbc",3); 
					Subjects sub5 = new Subjects("jee",4); 
					Subjects sub6 = new Subjects("hibernate",1); 
					subList1.add(sub2);
					subList1.add(sub1);
					subList1.add(sub3);
					subList1.add(sub4);
					subList2.add(sub5);
					subList2.add(sub1);
					subList2.add(sub4);
					subList2.add(sub3);
					
					StudentDemo sd = new StudentDemo("harun","harun@gmail.com","btm",515411);
					StudentDetail sdt  = new StudentDetail(02475702,"guntakal","ap");
					
					sd.setStudentdetail(sdt);
					sdt.setStudentdemo(sd);
					sd.setSubjects(subList1);
					sub1.setStudent(sd);
					sub4.setStudent(sd);
					sub3.setStudent(sd);
					sub2.setStudent(sd);
					
					
					hdaoi.insertStudentdetail(sdt);
					System.out.println("data inserted");
					
						
			
	}
}
