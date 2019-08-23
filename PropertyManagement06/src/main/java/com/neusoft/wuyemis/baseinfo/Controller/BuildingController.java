package com.neusoft.wuyemis.baseinfo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.wuyemis.baseinfo.model.BuildingModel;
import com.neusoft.wuyemis.baseinfo.service.IBuildingService;
import com.neusoft.wuyemis.message.ResultMessage;

@RestController
@RequestMapping(value="building")
public class BuildingController {
	@Autowired
	private IBuildingService buildingservice = null;
	
	//取得列表，带分页
	@RequestMapping(value="/list/all/page")
	public ResultMessage<BuildingModel> getListByAllWitPage(@RequestParam(required = false,defaultValue ="10") int rows,@RequestParam(required = false,defaultValue = "1") int page) throws Exception{
		ResultMessage<BuildingModel> result = new ResultMessage<BuildingModel>("OK","取得列表分页模式成功");
		result.setCount(buildingservice.getCountByAll());
		result.setPageCount(buildingservice.getPagaCountByAll(rows));
		result.setList(buildingservice.getListByAllWithPage(rows, page));
		result.setPage(page);
		result.setRows(rows);
		return result;
	}
	//增加
	@RequestMapping("/add")
	public ResultMessage<BuildingModel> add(BuildingModel building) throws Exception {
		buildingservice.addBuilding(building);
		return new ResultMessage<BuildingModel>("OK","增加成功");
	}
	//修改
	@PostMapping("/modify")
	public ResultMessage<BuildingModel> modify(BuildingModel building) throws Exception {
		buildingservice.modifyBuilding(building);
		return new ResultMessage<BuildingModel>("OK","修改成功");
	}
	//删除
	@PostMapping("/delete")
	public ResultMessage<BuildingModel> delete(BuildingModel building) throws Exception {
		buildingservice.deleteBuilding(building);
		return new ResultMessage<BuildingModel>("OK","删除成功");
	}

}
