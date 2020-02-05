package com.houlebin.job.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.houlebin.job.entity.Applicant;
import com.houlebin.job.entity.Job;
import com.houlebin.job.entity.Score;

public interface JobMapper {

	/**
	 * 
	 * @param flag
	 * @return
	 */
	List<Applicant> list(int flag);

	@Insert("INSERT INTO cctv_applicant(name,gender,birthday,college,major,edu,degree,created) "
			+ "VALUES(#{name},#{gender},#{birthday},#{college},#{major},#{edu},#{degree},now())")
	void add(Applicant applicant);

	@Select("SELECT * FROM cctv_applicant WHERE id=#{value}")
	Applicant getApplicant(int aid);

	@Select("SELECT * FROM cctv_job")
	List<Job> listJobs();
	@Insert("Replace INTO cctv_score(aid,jid,score) VALUES(#{aid},#{jid},#{score})")
	void addScore(Score score);

}
