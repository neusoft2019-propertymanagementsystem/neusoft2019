package com.neusoft.wuyemis.baseinfo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neusoft.wuyemis.baseinfo.dao.IBuildingDao;
import com.neusoft.wuyemis.baseinfo.model.BuildingModel;
import com.neusoft.wuyemis.baseinfo.service.IBuildingService;
@Service()
@Transactional(rollbackFor = Exception.class)
public class BuildingServiceImpl implements IBuildingService {
	@Autowired
	private IBuildingDao buildingdao = null;

	@Override
	public void addBuilding(BuildingModel buildingModel) throws Exception {
		buildingdao.insert(buildingModel);
		
	}

	@Override
	public void deleteBuilding(BuildingModel buildingModel) throws Exception {
		buildingdao.delete(buildingModel);
		
	}

	@Override
	public void modifyBuilding(BuildingModel buildingModel) throws Exception {
		buildingdao.delete(buildingModel);
		buildingdao.insert(buildingModel);
		
		
	}

	@Override
	public List<BuildingModel> selectListByAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getCountByAll() throws Exception {
		return buildingdao.selectCountByAll();
	}

	@Override
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
	public List<BuildingModel> getListByAllWithPage(int rows, int page) throws Exception {
		return buildingdao.selectListByAllWithPage(rows*(page-1), rows);
	}

}
