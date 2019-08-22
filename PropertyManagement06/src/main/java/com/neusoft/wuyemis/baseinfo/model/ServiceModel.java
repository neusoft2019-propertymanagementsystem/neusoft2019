package com.neusoft.wuyemis.baseinfo.model;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

//服务表
@Data
@Alias("Service")
public class ServiceModel implements Serializable{
	private int SPNO = 0;		//服务序号
	private int TYPENO = 0;		//服务类型编号
	private String SPNAME = null;		//服务名称
	private String Price = null;		//服务价格
	private String SPDesc = null;		//服务价格说明

}
