package com.neusoft.wuyemis.feeinfo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.neusoft.wuyemis.feeinfo.dao.IRoomFeeDao;
import com.neusoft.wuyemis.feeinfo.model.RoomFeeModel;
import com.neusoft.wuyemis.feeinfo.service.IRoomFeeService;
import com.neusoft.wuyemis.security.model.UserModel;

@Transactional(rollbackFor=Exception.class)
public class RoomFeeServiceImpl implements IRoomFeeService {
	@Autowired
	private IRoomFeeDao roomfeeDao=null;
	@Override
	public void feewrite(RoomFeeModel roomfeeModel) throws Exception {
		if(roomfeeModel.getClass(IRoomFeeDao.class)!=0) {
			roomfeeDao.create(roomfeeModel);
		}

	}

	@Override
	public void modify(RoomFeeModel roomfeeModel) throws Exception {
		

	}

	@Override
	public void delete(RoomFeeModel roomfeeModel) throws Exception {

	}

	@Override
	public List<UserModel> getListByAll() throws Exception {

		return null;
	}

}
