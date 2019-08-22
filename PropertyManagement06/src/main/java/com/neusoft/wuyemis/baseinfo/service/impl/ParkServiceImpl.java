package com.neusoft.wuyemis.baseinfo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neusoft.wuyemis.baseinfo.dao.IParkDao;
import com.neusoft.wuyemis.baseinfo.model.ParkModel;
import com.neusoft.wuyemis.baseinfo.service.IParkService;
@Service()
@Transactional(rollbackFor = Exception.class)
public class ParkServiceImpl implements IParkService {
	@Autowired
	private IParkDao parkdao = null;

	@Override
	public void addPark(ParkModel parkModel) throws Exception {
		parkdao.insert(parkModel);
		
	}

	@Override
	public void deletePark(ParkModel parkModel) throws Exception {
		parkdao.delete(parkModel);
		
	}

	@Override
	public void modifyPark(ParkModel parkModel) throws Exception {
		parkdao.delete(parkModel);
		parkdao.insert(parkModel);
		
	}

	@Override
	public List<ParkModel> selectListByAll() throws Exception {
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
	public List<ParkModel> getListByAllWithPage(int rows, int page) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
