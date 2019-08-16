package com.neusoft.wuyemis.admin.model;
//系统功能表
public class SystemFunctionModel {
	private int FUNNO = 0;		//功能编号
	private int MNO = 0;		//模块编号
	private String FUNNAME = null;		//功能名称
	private String FUNURL = null;		//URL地址
	private int LevelNo = 0;		//功能级别号
	
	public int getFUNNO() {
		return FUNNO;
	}
	public void setFUNNO(int fUNNO) {
		FUNNO = fUNNO;
	}
	public int getMNO() {
		return MNO;
	}
	public void setMNO(int mNO) {
		MNO = mNO;
	}
	public String getFUNNAME() {
		return FUNNAME;
	}
	public void setFUNNAME(String fUNNAME) {
		FUNNAME = fUNNAME;
	}
	public String getFUNURL() {
		return FUNURL;
	}
	public void setFUNURL(String fUNURL) {
		FUNURL = fUNURL;
	}
	public int getLevelNo() {
		return LevelNo;
	}
	public void setLevelNo(int levelNo) {
		LevelNo = levelNo;
	}

	
	
}
