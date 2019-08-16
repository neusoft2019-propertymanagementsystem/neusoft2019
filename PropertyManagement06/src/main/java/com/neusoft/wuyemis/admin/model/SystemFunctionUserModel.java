package com.neusoft.wuyemis.admin.model;
//系统功能权限表
public class SystemFunctionUserModel {
	private int FunNo = 0;		//功能号
	private String UserID = null;		//操作员账号
	public int getFunNo() {
		return FunNo;
	}
	public void setFunNo(int funNo) {
		FunNo = funNo;
	}
	public String getUserID() {
		return UserID;
	}
	public void setUserID(String userID) {
		UserID = userID;
	}

}
