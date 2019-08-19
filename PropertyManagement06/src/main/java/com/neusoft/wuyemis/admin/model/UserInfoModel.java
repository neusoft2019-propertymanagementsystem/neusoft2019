package com.neusoft.wuyemis.admin.model;

import java.io.Serializable;
//系统操作员表


public class UserInfoModel implements Serializable {
	
		private String userinfoId = null;		//操作员登录账号
		private String userinfoPassword = null;		//登录密码	
		private String userinfoName = null;		//姓名
		private String userinfoStatus = null;		//登录状态(Y/N)
		public String getUserinfoId() {
			return userinfoId;
		}
		public void setUserinfoId(String userinfoId) {
			this.userinfoId = userinfoId;
		}
		public String getUserinfoPassword() {
			return userinfoPassword;
		}
		public void setUserinfoPassword(String userinfoPassword) {
			this.userinfoPassword = userinfoPassword;
		}
		public String getUserinfoName() {
			return userinfoName;
		}
		public void setUserinfoName(String userinfoName) {
			this.userinfoName = userinfoName;
		}
		public String getUserinfoStatus() {
			return userinfoStatus;
		}
		public void setUserinfoStatus(String userinfoStatus) {
			this.userinfoStatus = userinfoStatus;
		}
		
		
}
