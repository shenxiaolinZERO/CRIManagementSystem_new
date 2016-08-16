package com.crims.bean;

public class Node<T> {
	    private int id;
	    private String text;
	    private int parentId;
	    private String state;
	    
	    
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getText() {
			return text;
		}
		public void setText(String text) {
			this.text = text;
		}
		public int getParentId() {
			return parentId;
		}
		public void setParentId(int parentId) {
			this.parentId = parentId;
		}
 
	      

}
