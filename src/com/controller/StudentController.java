package com.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.po.Student;
import com.service.IStudentService;


/**
 * controller�ӿ�
 */
@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping("/test")
	@ResponseBody
	public String test() {
		return "hello,word";
	}
	
	@Resource(name="studentService")
	public IStudentService service;
	
	/**
	 * ��ѯ����ѧ��
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/queryStudentList",produces = "text/plain;charset=UTF-8")
	public String queryStudentList() {
		List<Student> list = service.queryStudentList();
		return JSON.toJSONString(list);
	}
	
	/**
	 * ͨ��id��ѯѧ��
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/queryStudentById",produces = "text/plain;charset=UTF-8")
	public String queryStudentById() {
		Student student = service.queryStudentById(1002);
		return JSON.toJSONString(student);
	}
	
	
	/**
	 * ���ѧ����Ϣ
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/addStudent",produces = "text/plain;charset=UTF-8")
	public String addStudent() {
		Student student = new Student(1001, "����Ա2", "�Ĵ��ɶ�");
		int i = service.addStudent(student);
		return "��ӳɹ�";
	}
	
	/**
	 * ɾ��ѧ����Ϣ
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/deleteStudent",produces = "text/plain;charset=UTF-8")
	public String deleteStudent() {
		int i = service.deleteStudent(1007);
		return "ɾ���ɹ�";
	}
	
	/**
	 * �޸�ѧ����Ϣ
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/updateStudent",produces = "text/plain;charset=UTF-8")
	public String updateStudent() {
		Student student = new Student(1007, "����רԱ", "��������");
		int i = service.updateStudent(student);
		return "�޸ĳɹ�";
	}
	
	
}
