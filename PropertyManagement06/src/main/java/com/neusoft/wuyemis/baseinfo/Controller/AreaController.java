package com.neusoft.wuyemis.baseinfo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.wuyemis.baseinfo.model.AreaModel;
import com.neusoft.wuyemis.baseinfo.service.IAreaService;
import com.neusoft.wuyemis.message.ResultMessage;

@RestController
@RequestMapping(value="area")
public class AreaController {
	@Autowired
	private IAreaService areaservice = null;
	
	//取得小区列表
	@GetMapping(value="/list/all/page")
	public ResultMessage<AreaModel> getListByAllWitPage(@RequestParam(required = false,defaultValue ="10") int rows,@RequestParam(required = false,defaultValue = "1") int page) throws Exception{
		ResultMessage<AreaModel> result = new ResultMessage<AreaModel>("OK","取得小区列表分页模式成功");
		result.setCount(areaservice.getCountByAll());
		result.setPageCount(areaservice.getPagaCountByAll(rows));
		result.setList(areaservice.getListByAllWithPage(rows, page));
		result.setPage(page);
		result.setRows(rows);
		return result;
	}
	
}
