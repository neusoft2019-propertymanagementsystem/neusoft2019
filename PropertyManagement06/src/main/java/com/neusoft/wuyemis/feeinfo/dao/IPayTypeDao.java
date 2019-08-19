package com.neusoft.wuyemis.feeinfo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.neusoft.wuyemis.feeinfo.model.PayTypeModel;
@Mapper
public interface IPayTypeDao {
	public void create(PayTypeModel paytypeModel) throws Exception;
	
	public void update(PayTypeModel paytypeModel) throws Exception;
	
	public void delete(PayTypeModel paytypeModel) throws Exception;
	
	public List<PayTypeModel> selectListByAll() throws Exception; 

}
