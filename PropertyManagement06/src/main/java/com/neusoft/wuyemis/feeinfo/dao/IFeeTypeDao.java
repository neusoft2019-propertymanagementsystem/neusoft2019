package com.neusoft.wuyemis.feeinfo.dao;

import java.util.List;

import com.neusoft.wuyemis.feeinfo.model.FeeTypeModel;

public interface IFeeTypeDao {
	public void create(FeeTypeModel feetypeModel) throws Exception;
	
	public void update(FeeTypeModel feetypeModel) throws Exception;
	
	public void delete(FeeTypeModel feetypeModel) throws Exception;
	
	public List<FeeTypeModel> selectListByAllwithRoles() throws Exception; 

}
