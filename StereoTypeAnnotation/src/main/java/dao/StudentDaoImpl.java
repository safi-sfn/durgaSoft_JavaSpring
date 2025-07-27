package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import dto.Student;

@Repository("studentDao")
public class StudentDaoImpl implements IStudentDao {

	@Autowired
	private DataSource dataSource;
	@Override
	public String add(Student student) {
		String status = "";
		try {
			Connection con = dataSource.getConnection();
			PreparedStatement pst = con.prepareStatement("Select * from students where SID = ?");
			pst.setString(1, student.getsId());
			ResultSet rs = pst.executeQuery();
			boolean b = rs.next();
			if(b==true) {
				status="existed";
			}else {
				pst = con.prepareStatement("insert into students values(?,?,?)");
				pst.setString(1, student.getsId());
				pst.setString(2, student.getsName());
				pst.setString(3, student.getsAddr());
				int rowCount = pst.executeUpdate();
				if(rowCount==1) {
					status = "success";
				}else {
					status = "failure";
				}
			}
		} catch (Exception e) {
			status="failure";
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public Student search(String sId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String update(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String delete(String sId) {
		// TODO Auto-generated method stub
		return null;
	}

	


}
