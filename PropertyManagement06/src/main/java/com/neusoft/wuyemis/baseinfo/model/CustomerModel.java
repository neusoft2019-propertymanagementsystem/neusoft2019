package com.neusoft.wuyemis.baseinfo.model;

import java.util.Date;

import org.apache.ibatis.type.Alias;
import org.springframework.format.annotation.DateTimeFormat;
@Alias("User")
public class CustomerModel {
	private int CustomerNo = 0;  //客户序号
	private int TYPENO = 0;		//客户类型序号
	private String CCODE = null;		//客户编码
	private String CNAME = null;		//客户名称
	private String Contact = null;		//联系人姓名
	private String CardCode = null;		//身份证号码
	private String Mobile = null;		//手机号
	private String Tel = null;		//电话
	private String Fax =null;		//传真
	private String QQ = null;		//QQ
	private String WeiXin = null;		//微信
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date FeeStartDate = null;		//收费开始日期
	private Date FeeEndDate = null;		//收费截止日期
	private String CStatus = null;		//客户状态
	

}
