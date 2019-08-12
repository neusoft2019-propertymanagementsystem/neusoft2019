package com.neusoft.wuyemis.feeinfo.model;

import java.math.BigDecimal;

//维修报修表
public class MaintainRecordModel {
	private int RecordNo = 0;		//报修序号
	private int MTypeNo = 0;		//维修类型
	private int RoomNo = 0;		//Room序号
	private String ContactName = null;		//联系人
	private String Mobile = null;		//手机
	private String Tel = null;		//电话
	private DateTime MDate = null;		//报修日期
	private String MDesc = null;		//报修说明
	private String WEMPID = null;		//维修员工ID
	private DateTime WDate = null;		//维修日期
	private String WTask = null;		//维修内容
	private String WResult = null;		//维修结果
	private String WStatus = null;		//维修状态
	private BigDecimal WFee = null;		//维修费用
	private int ProviderNo = 0;		//维修服务公司序号
	private String ClientFeeback = null;		//客户反馈

}
