package com.neusoft.wuyemis.baseinfo.model;

import org.apache.ibatis.type.Alias;

import lombok.Data;

//维修类型表
@Data
@Alias("MaintainType")
public class MaintainTypeModel {
		private int TYPENO = 0;		//类型编号
		private String TYPENAME = null;		//类型名称

}
