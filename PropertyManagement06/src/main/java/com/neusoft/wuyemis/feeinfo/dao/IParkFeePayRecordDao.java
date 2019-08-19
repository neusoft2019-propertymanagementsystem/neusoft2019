package com.neusoft.wuyemis.feeinfo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.neusoft.wuyemis.feeinfo.model.ParkFeePayRecordModel;


@Mapper
public interface IParkFeePayRecordDao {
	public void create(ParkFeePayRecordModel parkfeepayrecordModel) throws Exception;
	
	public void update(ParkFeePayRecordModel parkfeepayrecordModel) throws Exception;
	
	public void delete(ParkFeePayRecordModel parkfeepayrecordModel) throws Exception;
	
	public List<ParkFeePayRecordModel> selectListByAllwithRoles() throws Exception; 

}
