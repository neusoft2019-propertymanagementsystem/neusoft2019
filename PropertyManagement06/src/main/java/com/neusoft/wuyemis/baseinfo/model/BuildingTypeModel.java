package com.neusoft.wuyemis.baseinfo.model;

import java.util.List;

import lombok.Data;

//建筑类型
@Data
public class BuildingTypeModel {
	private String TYPENO = null;		//类型编号
	private String TYPENAME = null;		//类型名称
	
	//关联的楼宇类型列表
	private List<BuildingModel> buildings= null;
}
