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
		}catch(Exception e){
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
			
			if(status.equals("existed")) {
				System.out.println("Student Existed Already");
			}
			if(status.equals("success")) {
				System.out.println("Student Insertion Success");
			}
			if(status.equals("failure")) {
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
			String sid = sc.next();  //--------------------D
			Student student = studentService.searchStudent(sid);
			if(student==null) {
				System.out.println("Student Not Existed");
			}else {
				System.out.println("Student Details");
				System.out.println("--------------------");
				System.out.println("Student ID      : "+student.getsId());
				System.out.println("Student Name    : "+student.getsName());
				System.out.println("Student Address : "+student.getsAddr());
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateStudent() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteStudent() {
		// TODO Auto-generated method stub
		
	}

	

}
