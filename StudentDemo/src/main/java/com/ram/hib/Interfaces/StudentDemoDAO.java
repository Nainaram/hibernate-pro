package com.ram.hib.Interfaces;

import java.util.ArrayList;

import com.ram.hib.entity.StudentDemo;
import com.ram.hib.entity.StudentDetail;

public interface StudentDemoDAO {
			
			public void insert(StudentDemo s);
			public ArrayList<StudentDemo> fetchAll();
			public StudentDemo fetchOne(int sid);
			public void update(String email, int sid);
			public void updateStudentDetail(String email,String city, int sid);
			public void delete(int sid);
			public void insertStudentdetail(StudentDetail sds);
}
