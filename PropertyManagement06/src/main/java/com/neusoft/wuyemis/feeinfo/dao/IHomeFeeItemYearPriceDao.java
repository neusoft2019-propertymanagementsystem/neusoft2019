package com.neusoft.wuyemis.feeinfo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.neusoft.wuyemis.feeinfo.model.HomeFeeItemYearPriceModel;


@Mapper
public interface IHomeFeeItemYearPriceDao {

	public void create(HomeFeeItemYearPriceModel homefeeitemyearpriceModel) throws Exception;
	
	public void update(HomeFeeItemYearPriceModel homefeeitemyearpriceModel ) throws Exception;
	
	public void delete(HomeFeeItemYearPriceModel homefeeitemyearpriceModel) throws Exception;

	public List<HomeFeeItemYearPriceModel> selectListByAll() throws Exception;
	
	
}

