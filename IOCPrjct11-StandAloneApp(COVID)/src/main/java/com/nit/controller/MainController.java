package com.nit.controller;

import com.nit.dto.PatientDTO;
import com.nit.service.IPatientMngtService;
import com.nit.vo.PatientVO;

public final class MainController {
	//Has A Property
	private IPatientMngtService service;
	
	public MainController(IPatientMngtService service) {
		System.out.println("MainController:: 1 Param COnstructor");
		this.service=service;
	}
	public String processPatient(PatientVO vo)throws Exception{
		//convert VO class obj to DTO class obj
		PatientDTO pDTO=new PatientDTO();
		pDTO.setPname(vo.getPname());
		pDTO.setPadd(vo.getPadd());
		pDTO.setPdchrge(Double.parseDouble(vo.getPdchrg()));
		pDTO.setDays(Double.parseDouble(vo.getDays()));
		
		
		//use Service
		String resultMsg=service.registerPatient(pDTO);
		return resultMsg;
	}

}
