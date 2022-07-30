package ems.member.dao;

import java.util.HashMap;
import java.util.Map;

import ems.member.Student;

public class StudentDao {

	private Map<String, Student> studentDB = new HashMap<String, Student>();
	
	
	public Student select(String sNum) {
		return studentDB.get(sNum);
	}
	
	public  void insert(Student student) {
		studentDB.put(student.getsNum(), student);
	}
}
