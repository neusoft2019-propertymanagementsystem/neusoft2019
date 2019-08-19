package com.neusoft.wuyemis.feeinfo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.neusoft.wuyemis.feeinfo.model.MaintainRecordModel;

@Mapper
public interface IMaintainRecordDao {
	public void create(MaintainRecordModel maintainrecordModel) throws Exception;
	
	public void update(MaintainRecordModel maintainrecordModel) throws Exception;
	
	public void delete(MaintainRecordModel maintainrecordModel) throws Exception;
	
	public List<MaintainRecordModel> selectListByAll() throws Exception; 

}
