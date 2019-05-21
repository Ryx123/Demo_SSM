package com.dao;

import java.util.List;

import com.po.Student;

public interface StudentMapper {

	Student queryStudentById(int sid);

	List<Student> queryStudent();

	int addStudent(Student student);

	int updateStudent(Student student);

	int deleteStudent(int sid);

}
