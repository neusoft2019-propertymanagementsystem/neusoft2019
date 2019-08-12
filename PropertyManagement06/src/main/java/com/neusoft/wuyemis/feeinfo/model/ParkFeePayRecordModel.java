package com.neusoft.wuyemis.feeinfo.model;

import java.math.BigDecimal;

//车位收费付款记录表
public class ParkFeePayRecordModel {
	private int PayNo = 0;		//记录号
	private int ParkFeeNo = 0;		//车位收费记录号
	private int PayTypeNo = 0;		//付款类型号
	private BigDecimal PayAmount = null;		//付款金额
	private DateTime PayDate = null;		//付款日期
	private String PayPerson = null;		//付款人
	private String Mobile = null;		//手机
	private String InvoiceCode = null;		//发票号
	private String PayNoteCode = null;		//付款凭证号
	private String PayDesc = null;		//付款说明

}
