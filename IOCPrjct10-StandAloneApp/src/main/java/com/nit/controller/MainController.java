package com.nit.controller;

import com.nit.dto.CustomerDTO;
import com.nit.service.ICustomerMngtService;
import com.nit.vo.CustomerVO;

public final class MainController {
	//Has A Property
	private ICustomerMngtService service;
	
	public MainController(ICustomerMngtService service) {
		System.out.println("MainController:: 1 Param COnstructor");
		this.service=service;
	}
	public String processCustomer(CustomerVO vo)throws Exception{
		//convert VO class obj to DTO class obj
		CustomerDTO custDTO=new CustomerDTO();
		custDTO.setCname(vo.getCname());
		custDTO.setCadd(vo.getCadd());
		custDTO.setPamnt(Double.parseDouble(vo.getPamnt()));
		custDTO.setTime(Double.parseDouble(vo.getTime()));
		custDTO.setRate(Double.parseDouble(vo.getRate()));
		
		//use Service
		String resultMsg=service.registerCustomer(custDTO);
		return resultMsg;
	}

}
