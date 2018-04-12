package com.web.read.common.bean;

/**
 * 
 * @Title PictureResult.java
 *        <p>
 *        Description: 上传图片的返回结果的封装类
 *        </p>
 *        <p>
 *        Company:
 *        </p>
 * @Package com.web.read.common.bean
 * @Author Administrator
 * @Date 2018年3月16日下午4:06:50
 * @version v1.0
 */
public class PictureResult {
	private int error;
	private String url;
	private String message;

	public PictureResult(int error, String url, String message) {
		super();
		this.error = error;
		this.url = url;
		this.message = message;
	}

	public int getError() {
		return error;
	}

	public void setError(int error) {
		this.error = error;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	// 成功时调用的方法
	public static PictureResult ok(String url) {
		return new PictureResult(0, url, null);
	}

	// 失败时调用的方法
	public static PictureResult error(String message) {
		return new PictureResult(1, null, message);
	}

}
