$(function(){
	$('#table').datagrid({
		width:1250,
		iconCls:'icon-ok',
		url:'',
		title:'设备详情 ',
		iconCls:'icon-search',
		
		columns:[[
		{
			field:'dev_id',
			title:'设备编号',
			width:100
		},
		{
			field:'dev_name',
			title:'设备名称',
			width:100
		},
		{
			field:'Cr_id',
			title:'机房编号',
			width:100
		},
		{
			field:'dev_businesssys',
			title:'所属业务系统',
			width:100
		},
		{
			field:'dev_cabbegin',
			title:'机柜起始U',
			width:50
		},
		{
			field:'dev_caboccupy',
			title:'所占U数',
			width:50
		},
		{
			field:'dev_brandname',
			title:'品牌',
			width:100
		},
		{
			field:'dev_modelnum',
			title:'型号',
			width:100
		},
		{
			field:'dev_productnum',
			title:'产品号',
			width:100
		},
		{
			field:'dev_fixassetnum',
			title:'固定资产编号',
			width:100
		},
		{
			field:'dev_serbegintime',
			title:'服务开始时间',
			width:100
		},
		{
			field:'dev_serendtime',
			title:'服务结束时间',
			width:100
		},
		{
			field:'dev_serprovider',
			title:'服务提供商',
			width:100
		},
		{
			field:'dev_state',
			title:'状态',
			width:50
		},
		{
			field:'dev_isvalid',
			title:'是否有效',
			width:50
		},
		{
			field:'dev_purpose',
			title:'用途',
			width:100
		},
		]],		
		pagination:true,
		pageSize:5,
		pageList:[5,10,15]
	});
});
