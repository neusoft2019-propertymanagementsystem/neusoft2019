package com.neusoft.wuyemis.feeinfo.service;

import java.util.List;

import com.neusoft.wuyemis.feeinfo.model.FeeItemYearPriceModel;

public interface IFeeItemYearPriceService {
	public void create(FeeItemYearPriceModel feeitemyearpriceModel) throws Exception;
	
	public void update(FeeItemYearPriceModel feeitemyearpriceModel) throws Exception;
	
	public void delete(FeeItemYearPriceModel feeitemyearpriceModel) throws Exception;
	
	public List<FeeItemYearPriceModel> selectListByAll() throws Exception; 

}
