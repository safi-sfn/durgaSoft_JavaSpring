package dao;

import dto.Student;

public interface IStudentDao {
	public String add(Student student);
	public Student search(String sId);
	public String update(Student student);
	public String delete(String sId);
}
