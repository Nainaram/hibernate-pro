package com.ram.hib.main;

import java.util.ArrayList;
import java.util.List;

import com.ram.hib.DAOImpl.StudentDemoDAOImpl;
import com.ram.hib.entity.Projects;
import com.ram.hib.entity.StudentDemo;
import com.ram.hib.entity.StudentDetail;
import com.ram.hib.entity.Subjects;

public class Main {
	private static StudentDemoDAOImpl hdaoi;
//	private static ArrayList<StudentDemo> slist;

	public static void main(String[] args) {
					hdaoi = new StudentDemoDAOImpl();
					
					StudentDemo sd =hdaoi.fetchOne(352);
					
					System.out.println(sd);
					System.out.println("\n");
					System.out.println("Student details \n");
					System.out.println(sd.getStudentdetail());
					
					System.out.println("subjects: \n");
					for(Subjects sub : sd.getSubjects()) {
						System.out.println((Subjects)sub);
					}
					System.out.println("\n\n projects: ");
					for(Projects pro : sd.getProjectsList()) {
						System.out.println(pro);
					}
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
//					List<Subjects> subList1 = new ArrayList<Subjects>();
//					List<Subjects> subList2 = new ArrayList<Subjects>();
//					List<Projects> proList1 = new ArrayList<Projects>();
//					Projects pro1 = new Projects("fooddeliveryapp",45,100);
//					Projects pro2 = new Projects("carrentalsystem",45,100);
//					Projects pro3 = new Projects("newsapplication",45,100);
////					Projects pro4 = new Projects("weatherapplication",45,100);
//					proList1.add(pro1);
//					proList1.add(pro2);
//					proList1.add(pro3);
//					
//					Subjects sub1 = new Subjects("HTML",5); 
//					Subjects sub2 = new Subjects("css",1); 
//					Subjects sub3 = new Subjects("javascript",2); 
//					Subjects sub4 = new Subjects("jdbc",3); 
//					Subjects sub5 = new Subjects("jee",4); 
////					Subjects sub6 = new Subjects("hibernate",1); 
//					subList1.add(sub2);
//					subList1.add(sub1);
//					subList1.add(sub3);
//					subList1.add(sub4);
//					subList2.add(sub5);
//					subList2.add(sub1);
//					subList2.add(sub4);
//					subList2.add(sub3);
//					
//					StudentDemo sd = new StudentDemo("rinku","rinku@gmail.com","anantapur",515411);
//					StudentDetail sdt  = new StudentDetail(02475702,"tadipatri","ap");
//					
//					sd.setStudentdetail(sdt);
//					sdt.setStudentdemo(sd);
//					sd.setSubjects(subList1);
//					sub1.setStudent(sd);
//					sub4.setStudent(sd);
//					sub3.setStudent(sd);
//					sub2.setStudent(sd);
//					sd.setProjectsList(proList1);
//					
//					
//					
//					
//					hdaoi.insert(sd);
//					System.out.println("data inserted");
//					
						
			
	}
}
