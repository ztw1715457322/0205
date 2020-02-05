package com.houlebin.job.entity;

/**
 * 面试成绩
 * @author zhuzg
 *
 */
public class Score {
	
	private int aid;
	private int jid;
	private int score;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public int getJid() {
		return jid;
	}
	public void setJid(int jid) {
		this.jid = jid;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Score [aid=" + aid + ", jid=" + jid + ", score=" + score + "]";
	}
	
	

}
