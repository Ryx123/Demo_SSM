package com.service;

import java.util.List;

import com.po.Student;

public interface IStudentService {

	
	/**
	 * ��ѯ����ѧ��
	 */
	public List<Student> queryStudentList();
	
	/**
	 * ���ѧ����Ϣ
	 */
	public int addStudent(Student student);
	/**
	 * ɾ��ѧ����Ϣ
	 */
	public int deleteStudent(int sid);
	
	/**
	 * �޸�ѧ����Ϣ
	 */
	public int updateStudent(Student student);
	
	/**
	 * ͨ��id��ѯ
	 */
	public Student queryStudentById(int sid);
	
}
