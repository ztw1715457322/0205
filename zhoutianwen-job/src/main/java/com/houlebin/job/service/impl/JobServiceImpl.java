package com.houlebin.job.service.impl;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.houlebin.job.dao.JobMapper;
import com.houlebin.job.entity.Applicant;
import com.houlebin.job.entity.Job;
import com.houlebin.job.entity.Score;
import com.houlebin.job.service.JobService;

@Service
public class JobServiceImpl  implements JobService{
	
	@Autowired
	JobMapper jobMapper;

	@Override
	public PageInfo<Applicant> list(int page,int flag) {
		// TODO Auto-generated method stub
		PageHelper.startPage(page, 3);
		
		return new PageInfo<Applicant>(jobMapper.list(flag));
	}

	@Override
	public void add(Applicant applicant) {
		// TODO Auto-generated method stub
		jobMapper.add(applicant);
		
	}

	@Override
	public Applicant getApplicant(int aid) {
		// TODO Auto-generated method stub
		return jobMapper.getApplicant(aid);
	}

	@Override
	public List<Job> listJobs() {
		// TODO Auto-generated method stub
		return jobMapper.listJobs();
	}

	@Override
	public void addScore(Score score) {
		// TODO Auto-generated method stub
		jobMapper.addScore(score);
		
	}
	
}
