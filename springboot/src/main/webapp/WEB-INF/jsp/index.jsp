<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<script type="text/javascript" src="/js/jquery.min.js"></script>
<script type="text/javascript">
var path = "${pageContext.request.contextPath}" + "/api";
</script>
<html>
<head>
<title>附件管理</title>
</head>
<body> 
Id:<input type="text" value="a" id="id" name="id" /> <br/>
名称:<input type="text" value="" id="name" name="name" /> <br/>

<br />
<input type="button" value="获取所有" onclick="getAll();" />
<input type="button" value="获取单个" onclick="getById();" />
<input type="button" value="更新" onclick="update();" />

<div style="float: right;position:absolute;right: 10px;top: 10; " >
	请求参数:<br/>
	<textarea id="queryData_" rows="10" cols="100">
	</textarea><br/>
	请求结果:<br/>
	<textarea id="result" rows="10" cols="100">
	</textarea>
</div>
	
</body>
</html>
<script type="text/javascript">
/**
 * 获取所有
 */
function getAll(){
	var jsons = {
			
	}
	$.ajax({
		data: jsons,
		type: "post",
		url: path + "/getAll",
		success:function(data){
			console.log(data);
			$("#queryData_").val(JSON.stringify(jsons));
			$("#result").val(JSON.stringify(data));
		}
	});
}
/**
 * 获取单个
 */
function getById(){
	var jsons = {
		id:$("#id").val(),       // id
	}
	$.ajax({
		data: jsons,
		type: "post",
		url: path + "/getById",
		success:function(data){
			console.log(data);
			$("#queryData_").val(JSON.stringify(jsons));
			$("#result").val(JSON.stringify(data));
		}
	});
}
/**
 * 更新
 */
function update(){
	var jsons = {
		id:$("#id").val(),       // id
		name:$("#name").val(),   // name
	}
	$.ajax({
		data: jsons,
		type: "post",
		url: path + "/update",
		success:function(data){
			console.log(data);
			$("#queryData_").val(JSON.stringify(jsons));
			$("#result").val(JSON.stringify(data));
		}
	});
}
</script>