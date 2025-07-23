package service;

import dto.Student;

public interface IStudentService {
	public String addStudent(Student student);
	public Student searchStudent(String sId);
	public Student getStudent(String sId);
	public String updateStudent(Student student);
	public String deleteStudent(String sID);
}
