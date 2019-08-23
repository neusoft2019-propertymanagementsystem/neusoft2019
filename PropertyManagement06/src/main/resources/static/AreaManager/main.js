	$(function(){
	var employeeId=null;
	var startJoinDate=null;
	var endJoinDate=null;
	var departmentNo=0;
	var roleNo=0;
	var sex="";
	//设置系统页面标题
	$("span#mainpagetille").html("员工管理");
	//设置日期的格式和选择//显示员工列表
	$("table#EmployeeGrid").jqGrid({
		url: host+'employee/list/condition/page',
		datatype: "json",
		colModel: [
			{ label: '账号', name: 'id', width: 75 },
			{ label: '姓名', name: 'name', width: 90 },
			{ label: '部门', name: 'department.name', width: 100 },
			{ label: '性别', name: 'sex', width: 40 },
			{ label: '年龄', name: 'age', width: 50},
			{ label: '出生日期', name: 'birthday', width: 70 },
			{ label: '入职日期', name: 'joinDate', width: 70 }   
		],
		caption:"员工列表",
		viewrecords: true, 
		autowidth: true,
		height: 400,
		rowNum: 20,
		rowList:[10,20,30],
		jsonReader : { 
		      root: "list", 
		      page: "page", 
		      total: "pageCount", 
		      records: "count", 
		      repeatitems: true, 
		      id: "id"},
		pager: "#EmployeeGridPager",
		multiselect:false,
		onSelectRow:function(empid){
			employeeId=empid;
		}
		
	});
});