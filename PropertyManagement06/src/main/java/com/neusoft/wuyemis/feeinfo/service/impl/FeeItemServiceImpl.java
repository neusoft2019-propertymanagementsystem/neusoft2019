package com.neusoft.wuyemis.feeinfo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neusoft.wuyemis.feeinfo.mapper.IFeeItemMapper;
import com.neusoft.wuyemis.feeinfo.model.FeeItemModel;
import com.neusoft.wuyemis.feeinfo.service.IFeeItemService;
@Service
@Transactional(rollbackFor=Exception.class)
public class FeeItemServiceImpl implements IFeeItemService {

	
	@Autowired
	private IFeeItemMapper feeitemMapper=null;
	@Override
	public void create(FeeItemModel feeitemModel) throws Exception {
		feeitemMapper.insert(feeitemModel);

	}

	@Override
	public void update(FeeItemModel feeitemModel) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(FeeItemModel feeitemModel) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public List<FeeItemModel> selectListByAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
