package com.neusoft.wuyemis.admin.model;

import java.io.Serializable;
//系统操作员表


public class UserInfoModel implements Serializable {
	
		private String UUSERID = null;		//操作员登录账号
		private String UPASSWORD = null;		//登录密码	
		private String UNAME = null;		//姓名
		private String UserStatus = null;		//登录状态(Y/N)
		public String getUUSERID() {
			return UUSERID;
		}
		public void setUUSERID(String uUSERID) {
			UUSERID = uUSERID;
		}
		public String getUPASSWORD() {
			return UPASSWORD;
		}
		public void setUPASSWORD(String uPASSWORD) {
			UPASSWORD = uPASSWORD;
		}
		public String getUNAME() {
			return UNAME;
		}
		public void setUNAME(String uNAME) {
			UNAME = uNAME;
		}
		public String getUserStatus() {
			return UserStatus;
		}
		public void setUserStatus(String userStatus) {
			UserStatus = userStatus;
		}

}
