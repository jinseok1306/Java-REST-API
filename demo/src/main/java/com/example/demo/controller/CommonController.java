package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.EmpVo;
import com.example.demo.model.ChildVo;
import com.example.demo.service.CommonService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

//Swagger : http://localhost:8080/swagger-ui/index.html

@Tag(name = "공통 api")
@RestController
public class CommonController {
	@Autowired
	CommonService service;
	
	@Operation(summary = "임직원",description = "임직원 전체 조회")
	@GetMapping(("/api/common/selectEmpAll"))
	public Object[] selectEmpAll() throws Exception {
		List<EmpVo> empList = service.selectEmpAll();
		return empList.toArray();
	}
	
	@Operation(summary = "임직원",description = "임직원 조회")
	@GetMapping(("/api/common/selectEmp"))
	public Object[] selectEmp(@RequestParam("name") String name) throws Exception {
		List<EmpVo> empList = service.selectEmp(name);
		return empList.toArray();
	}
	
	@Operation(summary = "임직원 자녀",description = "임직원 자녀 학교 조회")
	@GetMapping(("/api/common/listChildSchool"))
	public Object[] listChildSchool(@RequestParam("empNo") String empNo, @RequestParam("type") String type)
			throws Exception {
		List<ChildVo> childList = service.listChildSchool(empNo, type);
		return childList.toArray();
	}
}
