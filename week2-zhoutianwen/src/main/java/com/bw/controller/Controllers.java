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
public class Controllers {
@Autowired
	private MyService service;
@RequestMapping("getList.do")
public String a(Model model,@RequestParam(defaultValue="1")Integer pageNum, Business business){
	PageInfo<Business> page=service.getAll(pageNum, business);
	model.addAttribute("list", page.getList());
	model.addAttribute("page", page);
	return "list";
}
@RequestMapping("toSet.do")
public String b(Business business,Model model){
	Business allByID = service.getAllByID(business);
	model.addAttribute("b",allByID);
	return "update";
}
@RequestMapping("Update.do")
@ResponseBody
public int c(Business business){
	return service.SetBus(business);
}
}
