package com.neusoft.wuyemis.feeinfo.model;
//收费项目表
public class FeeItemModel {
	private int ItemNo = 0;		//收费项目序号
	private String ItemCode = null;		//收费项目编码
	private String ItemName = null;		//收费项目名称
	private String ItemUnit = null;		//收费单位(米,户，人，车)
	private int FeeTypeNo = 0;		//收费类型表
	private String FeePayMethod = null;		//计费方式(年，月，日,次)
	private String FeeCycle = null;		//是否周期性(Y/N)
	private String ItemStatus = null;		//是否收费(Y/N)
	private String ItemDesc = null;		//收费项目说明

}
