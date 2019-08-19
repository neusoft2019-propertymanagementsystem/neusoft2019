package com.neusoft.wuyemis.feeinfo.dao;

import java.util.List;

import com.neusoft.wuyemis.feeinfo.model.FeeItemYearPriceModel;

public interface IFeeItemYearPriceDao {
	public void create (FeeItemYearPriceModel feeItemYearPriceModel) throws Exception;
	public void update (FeeItemYearPriceModel feeItemYearPriceModel) throws Exception;
	public void delete (FeeItemYearPriceModel feeItemYearPriceModel) throws Exception;
	public List<FeeItemYearPriceModel> selectListByAll() throws Exception;

}
