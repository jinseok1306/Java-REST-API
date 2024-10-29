package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.CommonRepository;
import com.example.demo.model.ChildVo;
import com.example.demo.model.EmpVo;

@Service
public class CommonService {
	@Autowired
	CommonRepository commonRepository;
	
	public List<EmpVo> selectEmpAll() throws Exception{
		return commonRepository.selectEmpAll();
	}
	
	public List<EmpVo> selectEmp(String name) throws Exception{
		return commonRepository.selectEmp(name);
	}
	
	public List<ChildVo> listChildSchool(String empNo, String type) throws Exception{
		return commonRepository.listChildSchool(empNo, type);
	}
}
