package com.web.read.common.bean;

import java.util.List;
/**
 * 用来包装jsonp的数据
 * @Title   CatResult.java
 * <p>Description:</p>
 * <p>Company: </p>
 * @Package com.web.read.common.bean
 * @Author  Administrator
 * @Date    2018年3月21日下午9:27:40
 * @version v1.0
 */
public class CatResult {
	private List<?> data;

	public List<?> getData() {
		return data;
	}

	public void setData(List<?> data) {
		this.data = data;
	}

}
