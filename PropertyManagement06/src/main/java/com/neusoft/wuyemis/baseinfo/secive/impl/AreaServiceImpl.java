package com.neusoft.wuyemis.baseinfo.secive.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.wuyemis.baseinfo.dao.IAreaDao;
import com.neusoft.wuyemis.baseinfo.model.AreaModel;
import com.neusoft.wuyemis.baseinfo.secive.IAreaService;
@Service("AreaService")
public class AreaServiceImpl implements IAreaService {
	@Autowired
	private IAreaDao areaDao= null; 
	
	@Override
	public List<AreaModel> selectListByAll() throws Exception {
		return areaDao.selectListByAll();
	}

}
