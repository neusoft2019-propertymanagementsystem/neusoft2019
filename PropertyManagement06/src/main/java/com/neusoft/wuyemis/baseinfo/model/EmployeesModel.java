package com.neusoft.wuyemis.baseinfo.model;

import java.io.Serializable;
import java.util.Date;

import org.apache.ibatis.type.Alias;

import lombok.Data;

//员工信息表
@Data
@Alias("Employees")
public class EmployeesModel implements Serializable{
	private String EMPID = null;		//员工编号
	private int DEPTNO = 0;		//部门序号
	private String EMPName = null;		//员工姓名
	private String SEX = null;		//性别
	private int AGE = 0;		//年龄
	private Date JOINDATE = null;		//入职日期
	private String JOB = null;		//职位
	private String Mobile = null;		//手机
	private String Tel = null;		//电话
	private String QQ = null;		//QQ
	private String WX = null;		//微信
	

}
