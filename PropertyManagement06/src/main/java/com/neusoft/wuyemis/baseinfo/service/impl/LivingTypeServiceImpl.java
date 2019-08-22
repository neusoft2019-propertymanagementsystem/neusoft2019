package com.neusoft.wuyemis.baseinfo.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neusoft.wuyemis.baseinfo.service.ILivingTypeService;
@Service()
@Transactional(rollbackFor = Exception.class)
public class LivingTypeServiceImpl implements ILivingTypeService {

}
