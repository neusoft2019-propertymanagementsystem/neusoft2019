package com.neusoft.wuyemis.baseinfo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neusoft.wuyemis.baseinfo.dao.IAreaDao;
import com.neusoft.wuyemis.baseinfo.model.AreaModel;
import com.neusoft.wuyemis.baseinfo.model.BuildingModel;
import com.neusoft.wuyemis.baseinfo.service.IAreaService;
@Service()
@Transactional(rollbackFor = Exception.class)
public class AreaServiceImpl implements IAreaService {
	@Autowired
	private IAreaDao areaDao= null; 
	@Autowired
	
	//取得所有小区列表
	@Override
	public List<AreaModel> selectListByAll() throws Exception {
		return areaDao.selectListByAll();
	}
	
	//增加小区
	@Override
	public void addArea(AreaModel areaModel) throws Exception {
		areaDao.insert(areaModel);
		
	}
	//取得指定小区的列表
	@Override
	public List<BuildingModel> selectBuildingListByAreaNo() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	//删除小区
	@Override
	public void deleteArea(AreaModel areaModel) throws Exception {
		// TODO Auto-generated method stub
		
	}
	//修改小区
	@Override
	public void modifyArea(AreaModel areaModel) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional(readOnly=true)
	public List<AreaModel> getListByAllWithPage(int rows, int page) throws Exception {
		
		return areaDao.selectListByAllWithPage(rows*(page-1), rows);
	}
	//取得小区个数
	@Override
	@Transactional(readOnly = true)
	public int getCountByAll() throws Exception {
		return areaDao.selectCountByAll();
	}
	//取得页数
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

}
