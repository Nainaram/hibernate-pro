package com.ram.hib.DAOImpl;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ram.hib.Interfaces.StudentDemoDAO;
import com.ram.hib.entity.StudentDemo;
import com.ram.hib.entity.StudentDetail;
import com.ram.hib.entity.Subjects;

public class StudentDemoDAOImpl implements StudentDemoDAO{
	private Transaction t;
	private Session session;
	
	
		

	public StudentDemoDAOImpl() {
			session= new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(StudentDemo.class)
				.addAnnotatedClass(StudentDetail.class)
				.addAnnotatedClass(Subjects.class)
				.buildSessionFactory().openSession();
				
	}

	

	@Override
	public void insert(StudentDemo s) {
			t = session.beginTransaction();
			session.persist(s);
			t.commit();
		
	}

	@Override
	public ArrayList<StudentDemo> fetchAll() {
		
			return (ArrayList<StudentDemo>) session.createQuery("from StudentDemo").list();
		
	}

	@Override
	public StudentDemo fetchOne(int sid) {
				
		
				return session.get(StudentDemo.class, sid);
		
	}

	@Override
	public void update(String email,int sid) {
					t = session.beginTransaction();
			StudentDemo s = session.get(StudentDemo.class, sid);
			if(s!=null) {
				s.setEmail(email);
				session.persist(s);
			}
			session.getTransaction().commit();
	}

	@Override
	public void updateStudentDetail(String email,String city,int sid) {
					t = session.beginTransaction();
			StudentDemo s = session.get(StudentDemo.class, sid);
			if(s!=null) {
				s.setEmail(email);
				s.getStudentdetail().setCity(city);
				session.persist(s);
			}
			session.getTransaction().commit();
	}
	@Override
	public void delete(int sid) {
			t = session.beginTransaction();
			session.delete(fetchOne(sid));
			session.getTransaction().commit();
		
	}



	@Override
	public void insertStudentdetail(StudentDetail sds) {
		t = session.beginTransaction();
		session.persist(sds);
		t.commit();
		
	}
	

}
