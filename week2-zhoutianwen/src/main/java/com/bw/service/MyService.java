package com.bw.service;

import com.bw.bean.Business;
import com.github.pagehelper.PageInfo;

public interface MyService {
	PageInfo<Business> getAll(Integer pageNum,Business business);
	Business getAllByID(Business business);
	int SetBus(Business business);
}
