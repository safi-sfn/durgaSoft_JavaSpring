package controller;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import dto.Student;
import service.StudentServiceImpl;

@Controller("studentController")
public class StudentControllerImpl implements StudentController {

	Scanner sc = null;

	@Autowired
	private StudentServiceImpl studentService;

	public StudentControllerImpl() {

		try {
			sc = new Scanner(System.in);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void addStudent() {
		try {
			System.out.print("Student ID       : ");
			String sid = sc.next();
			System.out.print("Student Name     : ");
			String sname = sc.next();
			System.out.print("Student Address  : ");
			String saddr = sc.next();

			Student student = new Student();
			student.setsId(sid);
			student.setsName(sname);
			student.setsAddr(saddr);

			String status = studentService.addStudent(student);

			if (status.equals("existed")) {
				System.out.println("Student Existed Already");
			}
			if (status.equals("success")) {
				System.out.println("Student Insertion Success");
			}
			if (status.equals("failure")) {
				System.out.println("Student Insertion Failure");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void searchStudent() {
		try {
			System.out.print("Student ID  : ");
			String sid = sc.next();
			Student student = studentService.searchStudent(sid);
			if (student == null) {
				System.out.println("Student Not Existed");
			} else {
				System.out.println("Student Details");
				System.out.println("--------------------");
				System.out.println("Student ID      : " + student.getsId());
				System.out.println("Student Name    : " + student.getsName());
				System.out.println("Student Address : " + student.getsAddr());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void updateStudent() {
		try {
			System.out.print("Student ID  : ");
			String sid = sc.next();
			Student student = studentService.searchStudent(sid);
			if (student == null) {
				System.out.println("Student not existed");
			} else {
				System.out.print("Student Name : Old Value : '" + student.getsName() + "' New value  : ");
				String sname = sc.next();
				System.out.print("Student Address : Old Value  : '" + student.getsAddr() + "' New value  : ");
				String saddr = sc.next();
				student.setsName(sname);
				student.setsAddr(saddr);

				String status = studentService.updateStudent(student);
				if (status.equals("success")) {
					System.out.println("Updation Success");
				} else {
					System.out.println("Updation failure");
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void deleteStudent() {
		try {
			System.out.print("Student ID  : ");
			String sid = sc.next();
			String status = studentService.deleteStudent(sid);
			if (status.equals("success")) {
				System.out.println("Student Deletion Success");
			}
			if (status.equals("failure")) {
				System.out.println("Student Deletion Failure");
			}
			if (status.equals("notexisted")) {
				System.out.println("Student not existed");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
