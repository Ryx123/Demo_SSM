package com.service;

import java.util.List;

import com.po.Student;

public interface IStudentService {

	
	/**
	 * 查询所有学生
	 */
	public List<Student> queryStudentList();
	
	/**
	 * 添加学生信息
	 */
	public int addStudent(Student student);
	/**
	 * 删除学生信息
	 */
	public int deleteStudent(int sid);
	
	/**
	 * 修改学生信息
	 */
	public int updateStudent(Student student);
	
	/**
	 * 通过id查询
	 */
	public Student queryStudentById(int sid);
	
}
