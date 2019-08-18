package com.neusoft.wuyemis.feeinfo.model;

import java.math.BigDecimal;

//收费项目年度价格表
public class FeeItemYearPriceModel {
	private String FeeYear = null;		//收费年度
	private int ItemNo = 0;		//收费项目
	private BigDecimal Unitprice = null;		//单价
	//private DataTime StartDate = null;		//开始日期
	//private DataTime EndDtae = null;		//结束日期
	private String PriceDesc = null;		//注：年度和项目编号联合做主键

}
