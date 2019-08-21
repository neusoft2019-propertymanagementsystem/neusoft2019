package com.neusoft.wuyemis.baseinfo.secive;

import java.util.List;


import com.neusoft.wuyemis.baseinfo.model.AreaModel;

//Area的Service层接口
public interface IAreaService {
	//增加小区
	public void addArea() throws Exception;
	//取得所有的小区列表
	public List<AreaModel> selectListByAll() throws Exception;
}
