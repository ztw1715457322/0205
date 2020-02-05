package com.houlebin.job.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;
import com.houlebin.job.entity.Applicant;
import com.houlebin.job.entity.Job;
import com.houlebin.job.entity.Score;
import com.houlebin.job.service.JobService;

@Controller
class JobController {
	
	@Autowired
	JobService jobService;

	@RequestMapping("list")
	public String list(HttpServletRequest request,@RequestParam(defaultValue="0") int flag,
			@RequestParam(defaultValue="1") int page
			) {
		
		
		PageInfo<Applicant> pageApplicant =  jobService.list(page,flag);
		request.setAttribute("pageApplicant", pageApplicant);
		
		return "list";
	}
	

	@RequestMapping("toAdd")
	public String addApplicant(HttpServletRequest request) {
		
		return "add";
	}

	@RequestMapping("add")
	public String addApplicant(HttpServletRequest request,
			@ModelAttribute("applicant") @Valid Applicant applicant,BindingResult result) {
		if(result.hasErrors()) {
			return "add";
		}
		
		jobService.add(applicant);
		

		return "redirect:list";
	}
	

	@RequestMapping("toAddScore")
	public String addScore(HttpServletRequest request,int aid) {

		Applicant applicant = jobService.getApplicant(aid);

		List<Job> jobs = jobService.listJobs();
		
		request.setAttribute("jobs", jobs);
		request.setAttribute("applicant", applicant);
		
		return "addScore";
	}
	
	

	@RequestMapping("addScore")
	public String addScore(HttpServletRequest request,
			@ModelAttribute("score") @Valid  Score score,BindingResult result) {
		
		if(result.hasErrors())
			return "addScore";
		

		jobService.addScore(score);
		
		return "redirect:list";
		
	}
	
	
	
	
	
	
	
	
	
	

}
