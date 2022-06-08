package com.cognizant.daoimpl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.cognizant.dao.StudentDao;
import com.cognizant.entity.Student;
import com.mysql.cj.Query;

public class StudentDaoImpl implements StudentDao{

	private JdbcTemplate jdbcTemplate;
	
	public int insert(Student student) {
		// TODO Auto-generated method stub
		
		String query="INSERT INTO records(id,fname,lname) VALUES(?,?,?);";
		int r = this.jdbcTemplate.update(query,student.getId(),student.getfName(),student.getlNameString());
		return r;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int update(Student student) {
		// TODO Auto-generated method stub
		
		String query="UPDATE records SET fname =?, lname=? where id=? ";
		int r =this.jdbcTemplate.update(query,student.getfName(),student.getlNameString(),student.getId());
		return r;
	}

	public int delete(int id) {
		// TODO Auto-generated method stub
		String query="DELETE FROM records WHERE id = ?";
		int r = this.jdbcTemplate.update(query,id);
		return r;
	}

	public Student getStudent(int studentId) {
		// TODO Auto-generated method stub
		
		String query="select * from records where id=?";
		RowMapper<Student> rowMapper=new RowMapperImpl();
		Student student = this.jdbcTemplate.queryForObject(query, rowMapper, studentId);
		
		return student;
	}

	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		
		String query="select * from records";
		List<Student> student = this.jdbcTemplate.query(query,new RowMapperImpl());
		
		return student;
	}

	
}
