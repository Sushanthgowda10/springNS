package com.nit.dto;

import java.io.Serializable;

public class CustomerDTO implements Serializable {
	
	private Integer cno;
	private String cname;
	private String cadd;
	private Double pamnt;
	private Double rate;
	private Double time;
	
	//setters and getters
	public Integer getCno() {
		return cno;
	}
	public void setCno(Integer cno) {
		this.cno = cno;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCadd() {
		return cadd;
	}
	public void setCadd(String cadd) {
		this.cadd = cadd;
	}
	public Double getPamnt() {
		return pamnt;
	}
	public void setPamnt(Double pamnt) {
		this.pamnt = pamnt;
	}
	public Double getRate() {
		return rate;
	}
	public void setRate(Double rate) {
		this.rate = rate;
	}
	public Double getTime() {
		return time;
	}
	public void setTime(Double time) {
		this.time = time;
	}
	
	
	

}
