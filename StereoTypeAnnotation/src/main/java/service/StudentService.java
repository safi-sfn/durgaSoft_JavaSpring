package service;

import dto.Student;

public interface StudentService {
	public String addStudent(Student student);
	public Student searchStudent(String sId);
	public String updateStudent(Student student);
	public String deleteStudent(String sID);
}
