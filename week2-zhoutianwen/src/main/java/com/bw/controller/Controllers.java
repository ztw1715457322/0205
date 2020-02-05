package com.bw.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bw.bean.Business;
import com.bw.service.MyService;
import com.github.pagehelper.PageInfo;

@Controller
public class Controllers {//控制层
@Autowired
	private MyService service;
@RequestMapping("getList.do")//列表
public String a(Model model,@RequestParam(defaultValue="1")Integer pageNum, Business business){
	PageInfo<Business> page=service.getAll(pageNum, business);//分页的条件
	model.addAttribute("list", page.getList());//列表数据
	model.addAttribute("page", page);//分页的信息
	return "list";
}
@RequestMapping("toSet.do")//修改
public String b(Business business,Model model){
	Business allByID = service.getAllByID(business);
	model.addAttribute("b",allByID);
	return "update";
}
@RequestMapping("Update.do")//地址
@ResponseBody//ajax提交
public int c(Business business){
	return service.SetBus(business);
}
}
