package com.neusoft.wuyemis.baseinfo.model;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.type.Alias;

import lombok.Data;

//车位类型表
@Data
@Alias("ParkType")
public class ParkTypeModel {
	private int TYPENO = 0;		//类型编号
	private String TYPENAME = null;		//类型名称
	private BigDecimal UnitPrice = null; 		//单价
	private String Unit = null;		//单位（天/月/年）
	
	//关联的车位表类型列表
	private List<ParkModel> parks = null;

}
