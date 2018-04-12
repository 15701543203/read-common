package com.web.read.common.bean;

public class TreeNode {

	private long id;
	private String text;
	private String state;
	
	public TreeNode() {
		super();
	}

	public TreeNode(long id, String text, String state) {
		super();
		this.id = id;
		this.text = text;
		this.state = state;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "TreeNode [id=" + id + ", text=" + text + ", state=" + state + "]";
	}
	
	

}
