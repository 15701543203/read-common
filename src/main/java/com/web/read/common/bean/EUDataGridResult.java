package com.web.read.common.bean;

import java.util.List;
/**
 * 查询分页
 * @Title   EUDataGridResult.java
 * <p>Description: 结果封装</p>
 * <p>Company: </p>
 * @Package com.web.read.common.bean
 * @Author  Administrator
 * @Date    2018年3月22日下午5:08:20
 * @version v1.0
 */
public class EUDataGridResult  {
	private long total;
	private List<?> rows;

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public List<?> getRows() {
		return rows;
	}

	public void setRows(List<?> rows) {
		this.rows = rows;
	}

	@Override
	public String toString() {
		return "EUDataGridResult [total=" + total + ", rows=" + rows + "]";
	}
	

}
