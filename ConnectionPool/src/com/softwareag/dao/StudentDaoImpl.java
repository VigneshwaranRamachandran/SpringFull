package com.softwareag.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import javax.sql.DataSource;

import com.softwareag.model.Student;

public class StudentDaoImpl implements StudentDao {

	private DataSource ds;
	
	
	
	public void setDs(DataSource ds) {
		this.ds = ds;
	}

	@Override
	public int save(Student st) throws Exception {
		Connection con=ds.getConnection();
//		PreparedStatement ps=con.prepareStatement("insert into emp values(?,?,?)");
//		ps.setInt(1,st.getId());
//		ps.setString(2,st.getName());
//		ps.setString(3,st.getEmail());
//		int i=ps.executeUpdate();
//		con.close();
		int i=0;
		con.close();
		System.out.println(con);
		return i;
	}

	@Override
	public boolean update(Student st) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Student st) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Student findById(int id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student findByName(String name) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student findByEmail(String email) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student findByAddress(String address) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> findAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
