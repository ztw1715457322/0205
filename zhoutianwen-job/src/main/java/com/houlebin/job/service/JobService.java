package com.houlebin.job.service;

import java.util.List;

import javax.validation.Valid;

import com.github.pagehelper.PageInfo;
import com.houlebin.job.entity.Applicant;
import com.houlebin.job.entity.Job;
import com.houlebin.job.entity.Score;

public interface JobService {

	PageInfo<Applicant> list(int page,int flag);

	void add(Applicant applicant);

	Applicant getApplicant(int aid);

	List<Job> listJobs();

	void addScore(@Valid Score score);

}
