package com.neusoft.wuyemis.baseinfo.model;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.type.Alias;

import lombok.Data;

//居住类型
@Data
@Alias("LivingType")
public class LivingTypeModel implements Serializable{
	private int TYPENO = 0;		//类型编号
	private String TYPENAME = null;		//类型名称
	
	//关联的客户-房间表类型对象列表
	private List<CustomerHomeModel> customerHomes= null;
}
