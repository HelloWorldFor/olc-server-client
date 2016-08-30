package com.ztesoft.bsn.dubbo.entity;

import java.io.Serializable;

/**
 * dubbo返回基类
 * @author Administrator
 *
 */
public class DubboResponse implements Serializable{
	
	/** 
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	 */ 
	private static final long serialVersionUID = -5109501154478804669L;

	private int resultCode;
	
	private String resultDesc;
	
	private String jsonObject;

	public int getResultCode() {
		return resultCode;
	}

	public void setResultCode(int resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultDesc() {
		return resultDesc;
	}

	public void setResultDesc(String resultDesc) {
		this.resultDesc = resultDesc;
	}

	public String getJsonObject() {
		return jsonObject;
	}

	public void setJsonObject(String jsonObject) {
		this.jsonObject = jsonObject;
	}
	
	
	
}
