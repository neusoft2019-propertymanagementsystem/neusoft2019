package com.neusoft.wuyemis.baseinfo.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
	
	//取得所有小区的列表
	@GetMapping(value="/list/all")
	public List<AreaModel> getListByAll() throws Exception{
		return areaservice.selectListByAll();
	}
	
	//增加小区
	@RequestMapping("/add")
	public ResultMessage<AreaModel> add(AreaModel area) throws Exception {
		areaservice.addArea(area);
		return new ResultMessage<AreaModel>("OK","增加成功");
	}
	//修改部门
	@PostMapping("/modify")
	public ResultMessage<AreaModel> modify(AreaModel area) throws Exception {
		areaservice.modifyArea(area);
		return new ResultMessage<AreaModel>("OK","修改成功");
	}
	//删除部门
	@PostMapping("/delete")
	public ResultMessage<AreaModel> delete(AreaModel area) throws Exception {
		areaservice.deleteArea(area);
		return new ResultMessage<AreaModel>("OK","删除成功");
	}

	
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
