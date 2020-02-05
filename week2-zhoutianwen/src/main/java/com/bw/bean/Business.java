package com.bw.bean;

import java.math.BigInteger;
import java.util.Date;

public class Business {
	private BigInteger id;
	private String keywords;
	private String  represent;
	private String  name;
	private String  yproject;
	private String  address;
	private String  registered;
	private Date birthday ;
	private String  inspection;
	private String  state;//审核状态
	private String remark;
	
	public BigInteger getId() {
		return id;
	}
	public void setId(BigInteger id) {
		this.id = id;
	}
	public String getKeywords() {
		return keywords;
	}
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
	public String getRepresent() {
		return represent;
	}
	public void setRepresent(String represent) {
		this.represent = represent;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getYproject() {
		return yproject;
	}
	public void setYproject(String yproject) {
		this.yproject = yproject;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getRegistered() {
		return registered;
	}
	public void setRegistered(String registered) {
		this.registered = registered;
	}

	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public Business() {
		super();
	}
	public Business(BigInteger id, String keywords, String represent, String name, String yproject, String address,
			String registered, Date birthday, String inspection, String state, String remark) {
		super();
		this.id = id;
		this.keywords = keywords;
		this.represent = represent;
		this.name = name;
		this.yproject = yproject;
		this.address = address;
		this.registered = registered;
		this.birthday = birthday;
		this.inspection = inspection;
		this.state = state;
		this.remark = remark;
	}
	public String getInspection() {
		return inspection;
	}
	public void setInspection(String inspection) {
		this.inspection = inspection;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}
