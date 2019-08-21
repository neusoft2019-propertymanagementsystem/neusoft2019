package com.neusoft.wuyemis.baseinfo.model;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.type.Alias;

import lombok.Data;
//小区表
@Data
@Alias("Area")
public class AreaModel {
	private int AREANO = 0;		//小区编号
	private String AREANAME = null;		//小区名称
	private String AAddress = null;		//小区地址
	private String Developer = null;		//开发商
	private BigDecimal TotalBuidingArea = null;		//总建筑面积
	private BigDecimal TotalUseArea = null;		//总使用面积
	private BigDecimal TTotalPackArea = null;		//车位面积
	private int TotalHome = 0;		//总居民数		
	private int TotalHouse = 0;		//总公建数
	private int TotalPack = 0;		//车位数
	
	//关联楼宇对象列表
	private List<BuildingModel> Buildings = null; 
}
