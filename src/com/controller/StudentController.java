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
 * controller接口
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
	 * 查询所有学生
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/queryStudentList",produces = "text/plain;charset=UTF-8")
	public String queryStudentList() {
		List<Student> list = service.queryStudentList();
		return JSON.toJSONString(list);
	}
	
	/**
	 * 通过id查询学生
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/queryStudentById",produces = "text/plain;charset=UTF-8")
	public String queryStudentById() {
		Student student = service.queryStudentById(1002);
		return JSON.toJSONString(student);
	}
	
	
	/**
	 * 添加学生信息
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/addStudent",produces = "text/plain;charset=UTF-8")
	public String addStudent() {
		Student student = new Student(1001, "测试员2", "四川成都");
		int i = service.addStudent(student);
		return "添加成功";
	}
	
	/**
	 * 删除学生信息
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/deleteStudent",produces = "text/plain;charset=UTF-8")
	public String deleteStudent() {
		int i = service.deleteStudent(1007);
		return "删除成功";
	}
	
	/**
	 * 修改学生信息
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/updateStudent",produces = "text/plain;charset=UTF-8")
	public String updateStudent() {
		Student student = new Student(1007, "测试专员", "西藏拉萨");
		int i = service.updateStudent(student);
		return "修改成功";
	}
	
	
}
