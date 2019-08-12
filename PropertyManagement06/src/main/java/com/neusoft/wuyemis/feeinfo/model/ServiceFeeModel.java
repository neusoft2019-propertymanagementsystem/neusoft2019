package com.neusoft.wuyemis.feeinfo.model;

import java.math.BigDecimal;
import java.util.Date;

//服务费收入表
public class ServiceFeeModel {
	private int FeeNo = 0;		//服务收入序号
	private int SPNO = 0;		//服务序号
	private BigDecimal SFQTY = null;		//服务数量
	private BigDecimal SFAmount = null;		//服务金额
	private String SFPayer = null;		//缴费人
	private String ReceiveUserID = null;		//收款员
	private Date ReceiveDate = null;		//收款日期
	private String CheckUserID = null;		//审核员ID
	private Date CheckDate = null;		//审核日期

}
