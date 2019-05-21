package com.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.StudentMapper;
import com.po.Student;
import com.service.IStudentService;

@Service("studentService")
public class StudentServiceImpl implements IStudentService{

	@Resource
	StudentMapper studnetMapper;

	@Override
	public List<Student> queryStudentList() {
		return studnetMapper.queryStudent();
	}

	@Override
	public int addStudent(Student student) {
		// TODO Auto-generated method stub
		return studnetMapper.addStudent(student);
	}

	@Override
	public int deleteStudent(int sid) {
		// TODO Auto-generated method stub
		return studnetMapper.deleteStudent(sid);
	}

	@Override
	public int updateStudent(Student student) {
		// TODO Auto-generated method stub
		return studnetMapper.updateStudent(student);
	}

	@Override
	public Student queryStudentById(int sid) {
		// TODO Auto-generated method stub
		return studnetMapper.queryStudentById(sid);
	}

}
