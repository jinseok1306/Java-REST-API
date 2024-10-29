package com.example.demo.dao;

import java.util.List;
import com.example.demo.model.EmpVo;
import com.example.demo.model.ChildVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CommonRepository {
	List<EmpVo> selectEmpAll() throws Exception;
	
	List<EmpVo> selectEmp(@Param("name") String name) throws Exception;
	
	List<ChildVo> listChildSchool(@Param("empNo") String empNo, @Param("type") String type) throws Exception;
}
