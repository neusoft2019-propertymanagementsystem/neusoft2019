package com.neusoft.wuyemis.feeinfo.service;

import java.util.List;

import com.neusoft.wuyemis.feeinfo.model.FeeItemModel;

public interface IFeeItemService {
	public void create(FeeItemModel feeitemModel) throws Exception;
	
	public void update(FeeItemModel feeitemModel) throws Exception;
	
	public void delete(FeeItemModel feeitemModel) throws Exception;
	
	public List<FeeItemModel> selectListByAll() throws Exception; 

}
