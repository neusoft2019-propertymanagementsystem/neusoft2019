package com.neusoft.wuyemis.baseinfo.model;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.type.Alias;

import lombok.Data;

//客户类型
@Data
@Alias("CustomerType")
public class CustomerTypeModel implements Serializable{
	private int TYPENO = 0;		//客户类型编号
	private String TYPENAME = null;		//客户类型名称
	
	//关联的客户表对象列表
	private List<CustomerModel> cuctomers = null;
}
