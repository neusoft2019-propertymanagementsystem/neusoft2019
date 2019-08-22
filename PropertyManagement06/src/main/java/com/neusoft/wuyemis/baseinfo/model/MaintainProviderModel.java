package com.neusoft.wuyemis.baseinfo.model;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

//维修单位表
@Data
@Alias("MaintainProvider")
public class MaintainProviderModel implements Serializable{
	private int ProviderNO = 0;		//单位序号
	private String PName = null;		//单位名称
	private String PContact= null;		//联系人
	private String PAddress = null;		//单位地址
	private String PMobile = null;		//手机
	private String PTel= null;		//固定电话

}
