package com.student.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import com.student.beans.Student;

public class StudentDao {
	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public int save(Student s) {
		String sql = "insert into Student(name,physics,chemistry,biology) values('" + s.getName() + "',"
				+ s.getPhysics() + ",'" + s.getChemistry() + "','" + s.getBiology() + "')";
		return template.update(sql);
	}

	public int update(Student s) {
		


		String sql = "update Student set name='"+s.getName()+"',physics=" +s.getPhysics()+",chemistry='"+s.getChemistry()+"',biology='" +s.getBiology()+"' where id=" +s.getId()+"";
		return template.update(sql);
	}

	public int delete(int id) {
		String sql = "delete from Student where id=" + id + "";
		return template.update(sql);
	}

	public Student getStudentById(int id) {
		String sql = "select * from Student where id=?";
		return template.queryForObject(sql, new Object[] { id }, new BeanPropertyRowMapper<Student>(Student.class));
	}

	public List<Student> getStudents() {
		return template.query("select * from Student", new RowMapper<Student>() {
			public Student mapRow(ResultSet rs, int row) throws SQLException {
				Student s = new Student();
				s.setId(rs.getInt(1));
				s.setName(rs.getString(2));
				s.setPhysics(rs.getInt(3));
				s.setChemistry(rs.getInt(4));
				s.setBiology(rs.getInt(5));
				return s;
			}
		});
	}
}