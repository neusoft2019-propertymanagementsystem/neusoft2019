package com.neusoft.wuyemis.admin.model;
//系统功能表
public class SystemFunctionModel {
	private int funNo = 0;		//功能编号
	private int mno = 0;		//模块编号
	private String funName = null;		//功能名称
	private String funUrl = null;		//URL地址
	private int leveNo = 0;		//功能级别号
	public int getFunNo() {
		return funNo;
	}
	public void setFunNo(int funNo) {
		this.funNo = funNo;
	}
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public String getFunName() {
		return funName;
	}
	public void setFunName(String funName) {
		this.funName = funName;
	}
	public String getFunUrl() {
		return funUrl;
	}
	public void setFunUrl(String funUrl) {
		this.funUrl = funUrl;
	}
	public int getLeveNo() {
		return leveNo;
	}
	public void setLeveNo(int leveNo) {
		this.leveNo = leveNo;
	}
	
	
}
