package com.neusoft.wuyemis.baseinfo.model;

import java.util.List;

import lombok.Data;

//客户类型
@Data
public class CustomerTypeModel {
	private int TYPENO = 0;		//客户类型编号
	private String TYPENAME = null;		//客户类型名称
	
	//关联的客户表对象列表
	private List<CustomerModel> cuctomers = null;
}
