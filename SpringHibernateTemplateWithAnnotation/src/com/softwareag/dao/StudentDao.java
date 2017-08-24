package com.softwareag.dao;



import java.util.List;

import com.softwareag.model.Student;

public interface StudentDao {
public int save(Student st) ;
public boolean update(Student st);
public boolean delete(Student st);
public Student findById(int id);
public Student findByName(String name);
public Student findByEmail(String email);
public Student findByAddress(String address);
public List<Student> findAll();

}
