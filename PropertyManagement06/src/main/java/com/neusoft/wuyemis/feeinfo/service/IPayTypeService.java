package com.neusoft.wuyemis.feeinfo.service;

import java.util.List;

import com.neusoft.wuyemis.feeinfo.model.PayTypeModel;

public interface IPayTypeService {
	public void create(PayTypeModel paytypeModel) throws Exception;
	
	public void update(PayTypeModel paytypeModel) throws Exception;
	
	public void delete(PayTypeModel paytypeModel) throws Exception;
	
	public List<PayTypeModel> selectListByAll() throws Exception; 

}
