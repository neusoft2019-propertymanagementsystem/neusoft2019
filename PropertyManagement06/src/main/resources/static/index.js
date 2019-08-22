/**
 * baseinfo(基础信息模块)
 * @Author:刘勇超
 */
$(function(){
	$("ul.sidebar-menu li.treeview  ul li a").on("click",function(event){
		
		alert("OK");
		
		var url=$(this).attr("href");
		$("section#maincontent").load(url); //载入对应的对象管理主页
	});
});