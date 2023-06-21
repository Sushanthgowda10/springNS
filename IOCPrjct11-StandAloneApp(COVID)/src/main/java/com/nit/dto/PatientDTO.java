package com.nit.dto;

import java.io.Serializable;

public class PatientDTO implements Serializable {

	private Integer pno;
	private String pname;
	private String padd;
	private Double pdchrge;
	private Double days;
	private Double tamt;

	// setters and getters
	public Integer getPno() {
		return pno;
	}

	public void setPno(Integer pno) {
		this.pno = pno;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPadd() {
		return padd;
	}

	public void setPadd(String padd) {
		this.padd = padd;
	}

	public Double getPdchrge() {
		return pdchrge;
	}

	public void setPdchrge(Double pdchrge) {
		this.pdchrge = pdchrge;
	}

	public Double getDays() {
		return days;
	}

	public void setDays(Double days) {
		this.days = days;
	}
	public Double getTamt() {
		return tamt;
	}
	public void setTamt(Double tamt) {
		this.tamt = tamt;
	}

}
