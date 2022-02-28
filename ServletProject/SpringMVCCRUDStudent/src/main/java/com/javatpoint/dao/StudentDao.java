package com.javatpoint.dao;  
import java.sql.ResultSet;  
import java.sql.SQLException;  
import java.util.List;  
import org.springframework.jdbc.core.BeanPropertyRowMapper;  
import org.springframework.jdbc.core.JdbcTemplate;  
import org.springframework.jdbc.core.RowMapper;  
import com.javatpoint.beans.Student;  
  
public class StudentDao {  
JdbcTemplate template;  
  
public void setTemplate(JdbcTemplate template) {  
    this.template = template;  
}  
public int save(Student p){  
    String sql="insert into Student100(name,age,branch) values('"+p.getName()+"',"+p.getAge()+",'"+p.getBranch()+"')";  
    return template.update(sql);  
}  
public int update(Student p){  
    String sql="update Student100 set name='"+p.getName()+"', age="+p.getAge()+",branch='"+p.getBranch()+"' where id="+p.getId()+"";  
    return template.update(sql);  
}  
public int delete(int id){  
    String sql="delete from Student100 where id="+id+"";  
    return template.update(sql);  
}  
public Student getStudentById(int id){  
    String sql="select * from Student100 where id=?";  
    return template.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<Student>(Student.class));  
}  
public List<Student> getStudents(){  
    return template.query("select * from Student100",new RowMapper<Student>(){  
        public Student mapRow(ResultSet rs, int row) throws SQLException {  
            Student s=new Student();  
            s.setId(rs.getInt(1));  
            s.setName(rs.getString(2));  
            s.setAge(rs.getInt(3));  
            s.setBranch(rs.getString(4));  
            return s;  
        }  
    });  
}  
}  