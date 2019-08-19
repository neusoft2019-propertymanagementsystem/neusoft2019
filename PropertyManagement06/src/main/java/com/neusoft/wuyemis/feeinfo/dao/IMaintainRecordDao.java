package com.neusoft.wuyemis.feeinfo.dao;

import java.util.List;

import com.neusoft.wuyemis.feeinfo.model.MaintainRecordModel;

public interface IMaintainRecordDao {
	public void create (MaintainRecordModel maintainRecordModel) throws Exception;
	public void update (MaintainRecordModel maintainRecordModel) throws Exception;
	public void delete (MaintainRecordModel maintainRecordModel) throws Exception;
	public List<MaintainRecordModel> selectListByAll() throws Exception;

}
