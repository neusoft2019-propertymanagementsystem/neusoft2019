package com.neusoft.wuyemis.baseinfo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.neusoft.wuyemis.baseinfo.model.MaintainTypeModel;
@Mapper
public interface IMaintainTypeDao {
	public void create(MaintainTypeModel maintainTypeModel) throws Exception;
	public void update(MaintainTypeModel maintainTypeModel) throws Exception;
	public void delete(MaintainTypeModel maintainTypeModel) throws Exception;
	public List<MaintainTypeModel> selectListByAll() throws Exception;

}
