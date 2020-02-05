package com.bw.mapper;

import java.util.List;

import com.bw.bean.Business;

public interface BusinessMapper {
	List<Business> getALL(Business business);//列表分页模糊
	Business getAllByID(Business business);//回显
	int SetBus(Business business);//修改状态
}
