package controller;

import dto.Student;

public interface IStudentController {
	public String addStudent(Student student);
	public Student searchStudent(String sId);
	public String updateStudent(Student student);
	public String deleteStudent(String sID);
}
