package com.neusoft.wuyemis.feeinfo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.neusoft.wuyemis.feeinfo.model.FeeItemModel;

@Mapper
public interface IFeeItemDao {
	public void create(FeeItemModel feeitemModel) throws Exception;
	
	public void update(FeeItemModel feeitemModel) throws Exception;
	
	public void delete(FeeItemModel feeitemModel) throws Exception;
	
	public List<FeeItemModel> selectListByAllwithRoles() throws Exception; 
	
}
