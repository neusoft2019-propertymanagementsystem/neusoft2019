package com.neusoft.wuyemis.baseinfo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.wuyemis.baseinfo.dao.IAreaDao;
import com.neusoft.wuyemis.baseinfo.model.AreaModel;
import com.neusoft.wuyemis.baseinfo.model.BuildingModel;
import com.neusoft.wuyemis.baseinfo.service.IAreaService;
@Service("AreaService")
public class AreaServiceImpl implements IAreaService {
	@Autowired
	private IAreaDao areaDao= null; 
	
	@Override
	public List<AreaModel> selectListByAll() throws Exception {
		
		
		return areaDao.selectListByAll();
	}

	@Override
	public void addArea() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<BuildingModel> selectBuildingListByAreaNo() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}