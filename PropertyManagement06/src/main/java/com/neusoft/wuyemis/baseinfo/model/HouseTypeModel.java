package com.neusoft.wuyemis.baseinfo.model;

import java.util.List;

import org.apache.ibatis.type.Alias;

import lombok.Data;

//户型表
@Data
@Alias("HouseType")
public class HouseTypeModel {
	private String TYPENO = null;		//类型编号
	private String TYPENAME = null;		//类型名称
	
	//关联的房间表对象列表
	private List<RoomModel> rooms=null;
}
