package com.neusoft.wuyemis.feeinfo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.neusoft.wuyemis.feeinfo.model.ParkFeeModel;
@Mapper
public interface IParkFeeDao {
	public void create(ParkFeeModel parkfeeModel) throws Exception;
	
	public void update(ParkFeeModel parkfeeModel) throws Exception;
	
	public void delete(ParkFeeModel parkfeeModel) throws Exception;
	
	public List<ParkFeeModel> selectListByAllwithRoles() throws Exception; 

}
