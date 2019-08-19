package com.neusoft.wuyemis.feeinfo.service;

import java.util.List;

import com.neusoft.wuyemis.feeinfo.model.FeeTypeModel;

public interface IFeeTypeService {
	public void create (FeeTypeModel feeTypeModel) throws Exception;
	public void update (FeeTypeModel feeTypeModel) throws Exception;
	public void delete (FeeTypeModel feeTypeModel) throws Exception;
	public List<FeeTypeModel> selectListByAll() throws Exception;


}
