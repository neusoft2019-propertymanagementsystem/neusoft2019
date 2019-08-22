package com.neusoft.wuyemis.baseinfo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neusoft.wuyemis.baseinfo.dao.IParkTypeDao;
import com.neusoft.wuyemis.baseinfo.model.ParkTypeModel;
import com.neusoft.wuyemis.baseinfo.service.IParkTypeService;
@Service()
@Transactional(rollbackFor = Exception.class)
public class ParkTypeServiceImpl implements IParkTypeService {
	@Autowired
	private IParkTypeDao parkTypedao = null;

	@Override
	public void addParkType(ParkTypeModel parkTypeModel) throws Exception {
		parkTypedao.insert(parkTypeModel);
		
	}

	@Override
	public void deleteParkType(ParkTypeModel parkTypeModel) throws Exception {
		parkTypedao.delete(parkTypeModel);
		
	}

	@Override
	public void modifyParkType(ParkTypeModel parkTypeModel) throws Exception {
		parkTypedao.delete(parkTypeModel);
		parkTypedao.insert(parkTypeModel);
		
	}

	@Override
	public List<ParkTypeModel> selectListByAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getCountByAll() throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getPagaCountByAll(int rows) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<ParkTypeModel> getListByAllWithPage(int rows, int page) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
