package com.neusoft.wuyemis.baseinfo.dao;
/*
 * 模块：baseinfo
 * Dao接口
 * @Author: 刘勇超
 */

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.neusoft.wuyemis.baseinfo.model.BuildingModel;
import com.neusoft.wuyemis.baseinfo.model.BuildingTypeModel;
@Mapper
public interface IBuildingTypeDao {
	public void create(BuildingTypeModel buildingTypeModel) throws Exception;
	public void update(BuildingTypeModel buildingTypeModel) throws Exception;
	public void delete(BuildingTypeModel buildingTypeModel) throws Exception;
	public List<BuildingTypeModel> selectListByAll() throws Exception;
	
	//关联方法
	//建筑类型增加楼宇
	public void addBuilding(@Param("TYPENO")String TYPENO, @Param("BuildingNO") int BuildingNO) throws Exception; 
	//为建筑类型增加多个楼宇
	public void addBuildings(@Param("TYPENO") String TYPENO, @Param("BuildingNOList") int[] BuildingNOList) throws Exception;
	//取得指定建筑类型的所有楼宇
	public List<BuildingModel> selectBuildingListByBuildingType() throws Exception;
	//取得建筑类型和楼宇关联个数
	public int selectBuildingCountByBuildingType(@Param("TYPENO")String TYPENO, @Param("BuildingNO") int BuildingNO)throws Exception;

}
