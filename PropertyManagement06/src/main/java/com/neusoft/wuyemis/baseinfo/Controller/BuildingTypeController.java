package com.neusoft.wuyemis.baseinfo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.wuyemis.baseinfo.model.BuildingTypeModel;
import com.neusoft.wuyemis.baseinfo.service.IBuildingTypeService;
import com.neusoft.wuyemis.message.ResultMessage;

@RestController
@RequestMapping(value="buildingType")
public class BuildingTypeController {
	@Autowired
	private IBuildingTypeService buildingservice = null;
	//取得列表，带分页
	@RequestMapping(value="/list/all/page")
	public ResultMessage<BuildingTypeModel> getListByAllWitPage(@RequestParam(required = false,defaultValue ="10") int rows,@RequestParam(required = false,defaultValue = "1") int page) throws Exception{
		ResultMessage<BuildingTypeModel> result = new ResultMessage<BuildingTypeModel>("OK","取得列表分页模式成功");
		result.setCount(buildingservice.getCountByAll());
		result.setPageCount(buildingservice.getPagaCountByAll(rows));
		result.setList(buildingservice.getListByAllWithPage(rows, page));
		result.setPage(page);
		result.setRows(rows);
		return result;
	}
	//增加
	@RequestMapping("/add")
	public ResultMessage<BuildingTypeModel> add(BuildingTypeModel buildingType) throws Exception {
		buildingservice.addBuildingType(buildingType);
		return new ResultMessage<BuildingTypeModel>("OK","增加成功");
	}
	//修改
	@PostMapping("/modify")
	public ResultMessage<BuildingTypeModel> modify(BuildingTypeModel buildingType) throws Exception {
		buildingservice.modifyBuildingType(buildingType);
		return new ResultMessage<BuildingTypeModel>("OK","修改成功");
	}
	//删除
	@PostMapping("/delete")
	public ResultMessage<BuildingTypeModel> delete(BuildingTypeModel buildingType) throws Exception {
		buildingservice.deleteBuildingType(buildingType);
		return new ResultMessage<BuildingTypeModel>("OK","删除成功");
	}
	
}
