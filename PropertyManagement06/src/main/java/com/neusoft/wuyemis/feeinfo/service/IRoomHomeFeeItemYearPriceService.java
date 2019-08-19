package com.neusoft.wuyemis.feeinfo.service;

import java.util.List;

import com.neusoft.wuyemis.feeinfo.model.HomeFeeItemYearPriceModel;

public interface IRoomHomeFeeItemYearPriceService {

	public void create(HomeFeeItemYearPriceModel homefeeitemyearpriceModel) throws Exception;
	
	public void update(HomeFeeItemYearPriceModel homefeeitemyearpriceModel ) throws Exception;
	
	public void delete(HomeFeeItemYearPriceModel homefeeitemyearpriceModel) throws Exception;

	public List<HomeFeeItemYearPriceModel> selectListByAll() throws Exception;
	

}
