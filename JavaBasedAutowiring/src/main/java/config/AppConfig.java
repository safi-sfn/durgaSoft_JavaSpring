package config;

import java.sql.Connection;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import controller.StudentController;
import controller.StudentControllerImpl;
import dao.IStudentDao;
import dao.StudentDaoImpl;
import service.StudentService;
import service.StudentServiceImpl;

@Configuration
public class AppConfig {
	
	@Bean
	public DataSource dataSource() {
		  DriverManagerDataSource dataSource = null;
		try {
			dataSource =  new DriverManagerDataSource();
			    dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		        dataSource.setUrl("jdbc:mysql://localhost:3306/MyDB");
		        dataSource.setUsername("root");
		        dataSource.setPassword("MySQL@2025!");
		} catch (Exception e) {
			// TODO: handle exception
		}
		return dataSource;
	}
	
	@Bean
	public IStudentDao studentDao() {
		IStudentDao studentDao = new StudentDaoImpl();
		return studentDao;
	}

	@Bean
	public StudentService studentService() {
		StudentService studentService = new StudentServiceImpl();
		return studentService;
	}
	
	@Bean
	public StudentController studentController() {
		StudentController studentController = new StudentControllerImpl();
		return studentController;
	}
	
	
}
