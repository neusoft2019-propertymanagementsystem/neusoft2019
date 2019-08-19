package com.neusoft.wuyemis.feeinfo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.neusoft.wuyemis.feeinfo.model.FeeItemModel;
@Mapper
public interface IFeeItemDao {
	public void create (FeeItemModel feeItemModel) throws Exception;
	public void update (FeeItemModel feeItemModel) throws Exception;
	public void delete (FeeItemModel feeItemModel) throws Exception;
	public List<FeeItemModel> selectListByAll() throws Exception;

}
