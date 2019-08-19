package com.neusoft.wuyemis.feeinfo.dao;

import java.util.List;

import com.neusoft.wuyemis.feeinfo.model.PayTypeModel;

public interface IPayTypeDao {
	public void create (PayTypeModel PayTypeModel) throws Exception;
	public void update (PayTypeModel PayTypeModel) throws Exception;
	public void delete (PayTypeModel PayTypeModel) throws Exception;
	public List<PayTypeModel> selectListByAll() throws Exception;

}
