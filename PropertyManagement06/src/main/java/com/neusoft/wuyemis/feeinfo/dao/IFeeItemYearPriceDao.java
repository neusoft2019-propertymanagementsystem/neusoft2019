package com.neusoft.wuyemis.feeinfo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.neusoft.wuyemis.feeinfo.model.FeeItemYearPriceModel;

@Mapper
public interface IFeeItemYearPriceDao {
	public void create(FeeItemYearPriceModel feeitemyearpriceModel) throws Exception;
	
	public void update(FeeItemYearPriceModel feeitemyearpriceModel) throws Exception;
	
	public void delete(FeeItemYearPriceModel feeitemyearpriceModel) throws Exception;
	
	public List<FeeItemYearPriceModel> selectListByAll() throws Exception; 
	
}
