package com.crims.util;

import java.util.List;

import com.crims.bean.Node;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class JsonUtil {
	public static JSONArray getAuthByParentId(List<Node> list,String parentId)throws Exception{
		JSONArray jsonArray=new JSONArray();
		for (Node node : list) {
			if (parentId.equals(node.getParentId()+"")) {
				JSONObject jsonObject=new JSONObject();
				jsonObject.put("id", node.getId());
				jsonObject.put("text", node.getText());
				jsonObject.put("state", node.getState());
				JSONObject attributeObject=new JSONObject();
				jsonObject.put("attributes", attributeObject);
				jsonArray.add(jsonObject);
			}
		}
		return jsonArray;
	}
	
	public static JSONArray getAuthsByParentId(List<Node> list,String parentId)throws Exception{
		JSONArray jsonArray=getAuthByParentId(list, parentId);
		for(int i=0;i<jsonArray.size();i++){
			JSONObject jsonObject=jsonArray.getJSONObject(i);
			if("open".equals(jsonObject.getString("state"))){
				continue;
			}else{
				jsonObject.put("children", getAuthsByParentId(list,jsonObject.getString("id")));
			}

		}
		return jsonArray;
	}
}
