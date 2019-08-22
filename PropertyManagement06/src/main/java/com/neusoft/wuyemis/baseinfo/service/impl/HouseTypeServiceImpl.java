package com.neusoft.wuyemis.baseinfo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neusoft.wuyemis.baseinfo.dao.IHouseTypeDao;
import com.neusoft.wuyemis.baseinfo.model.HouseTypeModel;
import com.neusoft.wuyemis.baseinfo.service.IHouseTypeService;
@Service()
@Transactional(rollbackFor = Exception.class)
public class HouseTypeServiceImpl implements IHouseTypeService {
	@Autowired
	private IHouseTypeDao houseTypedao = null;

	@Override
	public void addHouseType(HouseTypeModel houseTypeModel) throws Exception {
		houseTypedao.insert(houseTypeModel);
		
	}

	@Override
	public void deleteHouseType(HouseTypeModel houseTypeModel) throws Exception {
		houseTypedao.delete(houseTypeModel);
		
	}

	@Override
	public void modifyHouseType(HouseTypeModel houseTypeModel) throws Exception {
		houseTypedao.delete(houseTypeModel);
		houseTypedao.insert(houseTypeModel);
		
	}

	@Override
	public List<HouseTypeModel> selectListByAll() throws Exception {
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
	public List<HouseTypeModel> getListByAllWithPage(int rows, int page) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
