package com.bw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bw.bean.Business;
import com.bw.mapper.BusinessMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
@Service
public class MyServiceImpl implements MyService{
@Autowired
private BusinessMapper mp;
	@Override
	public PageInfo<Business> getAll(Integer pageNum, Business business) {
		// TODO 自动生成的方法存根
		PageHelper.startPage(pageNum, 5);
		List<Business> list=mp.getALL(business);
		return new PageInfo<Business>(list);
	}
	@Override
	public Business getAllByID(Business business) {
		// TODO 自动生成的方法存根
		return mp.getAllByID(business);
	}
	@Override
	public int SetBus(Business business) {
		// TODO 自动生成的方法存根
		return mp.SetBus(business);
	}

}
