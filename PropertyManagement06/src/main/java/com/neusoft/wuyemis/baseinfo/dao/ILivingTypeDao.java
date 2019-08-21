package com.neusoft.wuyemis.baseinfo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.neusoft.wuyemis.baseinfo.model.LivingTypeModel;
@Mapper
public interface ILivingTypeDao {
	public void create(LivingTypeModel livingTypeModel) throws Exception;
	public void update(LivingTypeModel livingTypeModel) throws Exception;
	public void delete(LivingTypeModel livingTypeModel) throws Exception;
	public List<LivingTypeModel> selectListByAll() throws Exception;

}
