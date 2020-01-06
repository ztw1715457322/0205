package com.bw.mapper;

import java.util.List;

import com.bw.bean.Business;

public interface BusinessMapper {
	List<Business> getALL(Business business);
	Business getAllByID(Business business);
	int SetBus(Business business);
}
