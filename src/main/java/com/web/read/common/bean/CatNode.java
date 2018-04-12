package com.web.read.common.bean;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
/**
 * 分类列表的节点。包含u、n、i属性
 * @Title   CatNode.java
 * <p>Description:</p>
 * <p>Company: </p>
 * @Package com.web.read.common.bean
 * @Author  Administrator
 * @Date    2018年3月21日下午9:24:42
 * @version v1.0
 */
public class CatNode {

	@JsonProperty("n")
	private String name;
	@JsonProperty("u")
	private String url;
	@JsonProperty("i")
	private List<?>item;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public List<?> getItem() {
		return item;
	}
	public void setItem(List<?> item) {
		this.item = item;
	}
	
	
}
