   package com.neusoft.wuyemis.baseinfo.dao;
/*
 * 模块：baseinfo
 * Dao接口
 * @Author: 刘勇超
 */

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.neusoft.wuyemis.baseinfo.model.AreaModel;
import com.neusoft.wuyemis.baseinfo.model.BuildingModel;

@Mapper
public interface IAreaDao {
	public void create(AreaModel areaModel) throws Exception;
	public void update(AreaModel areaModel) throws Exception;
	public void delete(AreaModel areaModel) throws Exception;
	//返回列表
	public List<AreaModel> selectListByAll() throws Exception;
	//返回带分页的列表 star:起始的记录号 rows:取得的个数
	public List<AreaModel> selectListByAllWithPage(int star, int rows) throws Exception;
	//返回单个
	public AreaModel selectListById(String AREANO) throws Exception;
	
	//关联方法
	//为小区增加一个楼宇
	public void addBuilding(@Param("AREANO")String AREANO, @Param("BuildingNo") int BuildingNo) throws Exception;
	//为小区增加多个楼宇
	public void addBuildings(@Param("AREANO")String AREANO, @Param("BuildingNoList") int[] BuildingNoList) throws Exception;
	//取得指定小区的楼宇列表
	public List<BuildingModel> selectBuildingListByArea() throws Exception;
	//取得小区和楼宇关联的个数
	public int selectBuildingCountByArea(@Param("AREANO")String AREANO, @Param("BuildingNo") int BuildingNo) throws Exception;
}
