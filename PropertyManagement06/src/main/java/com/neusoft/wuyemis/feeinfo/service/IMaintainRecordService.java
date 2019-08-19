package com.neusoft.wuyemis.feeinfo.service;

import java.util.List;

import com.neusoft.wuyemis.feeinfo.model.MaintainRecordModel;

public interface IMaintainRecordService {
	public void create(MaintainRecordModel maintainrecordModel) throws Exception;
	
	public void update(MaintainRecordModel maintainrecordModel) throws Exception;
	
	public void delete(MaintainRecordModel maintainrecordModel) throws Exception;
	
	public List<MaintainRecordModel> selectListByAll() throws Exception; 

}
