package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.IStudentDao;
import dto.Student;

@Service("studentService")
public class StudentServiceImpl implements StudentService {

	@Autowired
	private IStudentDao studentDao;

	@Override
	public String addStudent(Student student) {
		String status = studentDao.add(student);
		return status;
	}

	@Override
	public Student searchStudent(String sId) {
		Student student = studentDao.search(sId);
		return student;
	}

	@Override
	public String updateStudent(Student student) {
		String status = studentDao.update(student);
		return status;
	}

	@Override
	public String deleteStudent(String sID) {
		String status = studentDao.delete(sID);
		return status;

	}

}
