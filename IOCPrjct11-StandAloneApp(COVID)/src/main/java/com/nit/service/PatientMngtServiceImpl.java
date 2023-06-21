package com.nit.service;

import com.nit.bo.PatientBo;
import com.nit.dao.IPatientDAO;
import com.nit.dto.PatientDTO;

public class PatientMngtServiceImpl implements IPatientMngtService {

	// Has A Property
	private IPatientDAO dao;

	public PatientMngtServiceImpl(IPatientDAO dao) {
		System.out.println("PatientMngtServiceImpl- 1 param constructor");
		this.dao = dao;
	}// constructor

	@Override
	public String registerPatient(PatientDTO pDTO) throws Exception {
		System.out.println("PatientMngtServiceImpl.registerPatient()");
		// write b.logic to
		// calculate interest
		double totalCharge = (pDTO.getDays() * pDTO.getPdchrge());

		// prepare PatientBO class object hVING Persistable data
		PatientBo pBO = new PatientBo();
		pBO.setPname(pDTO.getPname());
		pBO.setPadd(pDTO.getPadd());
		pBO.setDays(pDTO.getDays());
		pBO.setPdchrg(pDTO.getPdchrge());
		pBO.setTamt(totalCharge);
		// use DAO
		int count = dao.insert(pBO);

		// process the result
		return count == 0 ? "Registration failed" : "Registration succedded:: Total Amount At Time Of Discharge:: " + totalCharge;
	}

}
