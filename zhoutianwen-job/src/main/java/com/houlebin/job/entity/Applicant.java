package com.houlebin.job.entity;

import java.util.Date;

import javax.validation.constraints.Future;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * 应聘者
 * @author zhuzg
 *
 */
public class Applicant {
	
	
	
	private Integer  id        ;
	
	@NotBlank(message="应聘者姓名不能为空")
	private String name      ;
	
	@NotNull(message="请选择性别")
	private Gender gender    ;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@Past(message="生日必须小于当前的日期")
	//@Future
	private Date birthday  ;
	
	@NotBlank(message="大学不能为空")
	@Length(max=80,min=2,message="大学名称超出范围")
	private String college   ;
	
	@NotBlank(message="大学不能为空")
	@Length(max=80,min=2,message="大学名称超出范围")
	private String major     ;
	
	@NotNull
	private int edu       ;
	@NotNull
	private int degree    ;
	
	private Date created   ;
	
	//面试成绩的字符串
	private String strScore;
	
	private int avgScore;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getEdu() {
		return edu;
	}

	public void setEdu(int edu) {
		this.edu = edu;
	}

	public int getDegree() {
		return degree;
	}

	public void setDegree(int degree) {
		this.degree = degree;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public String getStrScore() {
		return strScore;
	}

	public void setStrScore(String strScore) {
		this.strScore = strScore;
	}

	public int getAvgScore() {
		return avgScore;
	}

	public void setAvgScore(int avgScore) {
		this.avgScore = avgScore;
	}

	@Override
	public String toString() {
		return "Applicant [id=" + id + ", name=" + name + ", gender=" + gender + ", birthday=" + birthday + ", college="
				+ college + ", major=" + major + ", edu=" + edu + ", degree=" + degree + ", created=" + created
				+ ", strScore=" + strScore + ", avgScore=" + avgScore + "]";
	}
	
	
	

}
