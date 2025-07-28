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

	private static final String SQL_QUERY = "SELECT * FROM students WHERE sid = ?";
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
			if (b == true) {
				status = "existed";
			} else {
				pst = con.prepareStatement("insert into students values(?,?,?)");
				pst.setString(1, student.getsId());
				pst.setString(2, student.getsName());
				pst.setString(3, student.getsAddr());
				int rowCount = pst.executeUpdate();
				if (rowCount == 1) {
					status = "success";
				} else {
					status = "failure";
				}
			}
		} catch (Exception e) {
			status = "failure";
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public Student search(String sId) {
		Student student = null;
		try {
			Connection connection = dataSource.getConnection();
			PreparedStatement prst = connection.prepareStatement(SQL_QUERY);
			prst.setString(1, sId);
			ResultSet rs = prst.executeQuery();
			boolean b = rs.next();
			if (b == true) {
				student = new Student();
				student.setsId(rs.getString("sId"));
				student.setsName(rs.getString("sName"));
				student.setsAddr(rs.getString("sAddr"));
			} else {
				student = null;

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return student;
	}

	@Override
	public String update(Student student) {
		String status = "";
		try {
			Connection connection = dataSource.getConnection();
			PreparedStatement prst = connection.prepareStatement("UPDATE students SET sName=?, sAddr=? WHERE sID=?");
			prst.setString(1, student.getsName());
			prst.setString(2, student.getsAddr());
			prst.setString(3, student.getsId());
			int rowCount = prst.executeUpdate();
			if (rowCount == 1) {
				status = "success";
			} else {
				status = "failure";
			}

		} catch (Exception e) {
			status = "failure";
			e.printStackTrace();
		}

		return status;
	}

	@Override
	public String delete(String sId) {
		String status = "";
		try {
			Connection connection = dataSource.getConnection();
			PreparedStatement prst = connection.prepareStatement("SELECT * FROM students WHERE sId=?");
			prst.setString(1, sId);
			ResultSet rs = prst.executeQuery();
			boolean b = rs.next();
			if (b == true) {
				prst = connection.prepareStatement("DELETE FROM students WHERE sId=?");
				prst.setString(1, sId);
				int rowCount = prst.executeUpdate();
				if (rowCount == 1) {
					status = "success";
				} else {
					status = "failure";
				}

			} else {
				status = "notexisted";
			}
		} catch (Exception e) {
			status = "failure";
			e.printStackTrace();
		}
		return status;
	}

}
