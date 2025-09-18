package com.rt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.RowMapperResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.er.Entity.Employee;

@Repository
public class StudentDao {
	
@Autowired	
JdbcTemplate jt;

public void insert(Employee e){
	Object res[]={e.getName(),e.getSalary()};
	jt.update("insert into studentinformation(name,salary) values(?,?)",res);
	
}

public void update(Employee e) {
	// TODO Auto-generated method stub'
	Object res[]={e.getName(),e.getSalary(),e.getId()};
	jt.update("update studentinformation set name=?,salary=? where id=?",res);
	
}

public void delet(Employee e) {
	Object res[]={e.getId()};
	jt.update("delete from studentinformation where id = ?",res);


	
}

public void slect(Employee e) {
	Object res[]={e.getId()};
	jt.queryForObject("select * from studentinformation where id = ?",res,new RowMapper<Employee>() {

		@Override
		public Employee mapRow(ResultSet rs, int arg1) throws SQLException {
			Employee e = new Employee();
			e.setId(rs.getInt(1));
			e.setName(rs.getString(2));
			e.setSalary(rs.getInt(3));



			return e;
		}
	} );

	
}

public List<Employee> slectall() {
	
	List<Employee> list=null;
	// TODO Auto-generated method stub
	list=jt.query("select * from studentinformation ", new RowMapper<Employee>(){

		@Override
		public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
			Employee e = new Employee();
			e.setId(rs.getInt(1));
			e.setName(rs.getString(2));
			e.setSalary(rs.getInt(3));



			return e;
		}});
	return list;
}

}
