package com.nit.bo;

public class PatientBo {
	private Integer pno;
	private String pname;
	private String padd;
	private Double pdchrg;
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

	public Double getPdchrg() {
		return pdchrg;
	}

	public void setPdchrg(Double pdchrg) {
		this.pdchrg = pdchrg;
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
