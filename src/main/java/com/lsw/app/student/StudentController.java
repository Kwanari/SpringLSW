package com.lsw.app.student;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;

	@RequestMapping("/student/list")
	public String getList(HttpServletRequest request) {

		System.out.println("list 가져오기");
		studentService.getList();

		return "student/list";
	}

	@RequestMapping("/student/detail")
	public String getDetail() {

		return "student/detail";
	}

}
