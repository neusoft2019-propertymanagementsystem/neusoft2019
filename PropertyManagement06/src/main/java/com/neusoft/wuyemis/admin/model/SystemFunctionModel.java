package com.neusoft.wuyemis.admin.model;

import org.apache.ibatis.type.Alias;

import lombok.Data;

//系统功能表
@Alias("SystemFunction")
@Data
public class SystemFunctionModel {
	private int funNo = 0;		//功能编号
	private int mno = 0;		//模块编号
	private String funName = null;		//功能名称
	private String funUrl = null;		//URL地址
	private int leveNo = 0;		//功能级别号
	
	
}
