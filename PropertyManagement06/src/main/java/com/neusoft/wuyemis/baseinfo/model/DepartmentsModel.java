package com.neusoft.wuyemis.baseinfo.model;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

//部门信息表
@Data
@Alias("Departments")
public class DepartmentsModel implements Serializable{
	private int DEPTNO = 0;		//部门序号
	private String DEPTNAME = null;		//部门名称
	private String DDESC = null;		//部门职责
}
