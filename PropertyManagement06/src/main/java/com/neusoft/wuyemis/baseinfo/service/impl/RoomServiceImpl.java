package com.neusoft.wuyemis.baseinfo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neusoft.wuyemis.baseinfo.dao.IRoomDao;
import com.neusoft.wuyemis.baseinfo.model.RoomModel;
import com.neusoft.wuyemis.baseinfo.service.IRoomService;
@Service()
@Transactional(rollbackFor = Exception.class)
public class RoomServiceImpl implements IRoomService {
	@Autowired
	private IRoomDao roomdao = null;

	@Override
	public void addRoom(RoomModel roomModel) throws Exception {
		roomdao.insert(roomModel);
		
	}

	@Override
	public void deleteRoom(RoomModel roomModel) throws Exception {
		roomdao.delete(roomModel);
		
	}

	@Override
	public void modifyRoom(RoomModel roomModel) throws Exception {
		roomdao.delete(roomModel);
		roomdao.insert(roomModel);
		
	}

	@Override
	public List<RoomModel> selectListByAll() throws Exception {
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
	public List<RoomModel> getListByAllWithPage(int rows, int page) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
