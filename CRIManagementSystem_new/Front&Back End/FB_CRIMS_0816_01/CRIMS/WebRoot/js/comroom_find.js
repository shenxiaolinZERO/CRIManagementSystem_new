/**
 * Created by Microsoft on 2016/8/12.
 */
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
                title:'机房编号',
                width:100
            },
            {
                field:'dev_name',
                title:'机房名称',
                width:100
            },
            {
                field:'Cr_id',
                title:'机房区域',
                width:100
            },
            {
                field:'dev_businesssys',
                title:'所属业务系统',
                width:100
            },
            {
                field:'dev_cabbegin',
                title:'收藏日期',
                width:50
            },
            {
                field:'dev_caboccupy',
                title:'机房联系人',
                width:50
            },
            {
                field:'dev_brandname',
                title:'联系人电话',
                width:100
            },
            {
                field:'dev_modelnum',
                title:'联系人邮箱',
                width:100
            },
            {
                field:'dev_productnum',
                title:'状态',
                width:100
            }


        ]],
        pagination:true,
        pageSize:5,
        pageList:[5,10,15]
    });
});