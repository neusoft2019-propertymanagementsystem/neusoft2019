package com.neusoft.wuyemis.feeinfo.dao;

import java.util.List;

import com.neusoft.wuyemis.feeinfo.model.FeeTypeModel;

public interface IFeeTypeDao {
	public void create (FeeTypeModel feeTypeModel) throws Exception;
	public void update (FeeTypeModel feeTypeModel) throws Exception;
	public void delete (FeeTypeModel feeTypeModel) throws Exception;
	public List<FeeTypeModel> selectListByAll() throws Exception;

}
