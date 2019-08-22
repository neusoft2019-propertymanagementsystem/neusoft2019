package com.neusoft.wuyemis.baseinfo.model;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

//服务类型表
@Data
@Alias("ServiceType")
public class ServiceTypeModel implements Serializable{
	private int TYPENO = 0;		//类型编号
	private String TYPENAME = null;		//类型名称
}
