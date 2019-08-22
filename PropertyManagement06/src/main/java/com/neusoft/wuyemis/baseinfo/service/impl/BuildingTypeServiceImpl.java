package com.neusoft.wuyemis.baseinfo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neusoft.wuyemis.baseinfo.dao.IBuildingTypeDao;
import com.neusoft.wuyemis.baseinfo.model.BuildingTypeModel;
import com.neusoft.wuyemis.baseinfo.service.IBuildingTypeService;
@Service()
@Transactional(rollbackFor = Exception.class)
public class BuildingTypeServiceImpl implements IBuildingTypeService {
	@Autowired
	IBuildingTypeDao buildingTypeDao = null;
	
	//增加
	@Override
	public void addBuildingType(BuildingTypeModel buildingTypeModel) throws Exception {
		buildingTypeDao.insert(buildingTypeModel);
		 
	}
	
	@Override
	@Transactional(readOnly = true)
	public int getCountByAll() throws Exception {
		return buildingTypeDao.selectCountByAll();
	}

	@Override
	@Transactional(readOnly = true)
	public int getPagaCountByAll(int rows) throws Exception {
		int pageCount=0;
		int count=this.getCountByAll();
		if(count%rows==0) {
			pageCount=count/rows;
		}
		else {
			pageCount=count/rows+1;
		}
		return pageCount;
	}


	@Override
	public List<BuildingTypeModel> getListByAllWithPage(int rows, int page) throws Exception {
		
		return buildingTypeDao.selectListByAllWithPage(rows*(page-1), rows);
	}
	
	//删除
	@Override
	public void deleteBuildingType(BuildingTypeModel buildingTypeModel) throws Exception {
		 buildingTypeDao.delete(buildingTypeModel);	
	}
	
	//修改
	@Override
	public void modifyBuildingType(BuildingTypeModel buildingTypeModel) throws Exception {
		buildingTypeDao.delete(buildingTypeModel);
		buildingTypeDao.insert(buildingTypeModel);
	}

}
