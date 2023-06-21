package com.nit.controller;

import org.springframework.stereotype.Controller;

import com.nit.dto.CustomerDTO;
import com.nit.service.ICustomerMngtService;
import com.nit.vo.CustomerVO;
@Controller("controller")
public final class MainController {
	//Has A Property
	private ICustomerMngtService service;
	
	
	public MainController() {
		System.out.println("MainController.MainController()");
	}
	public MainController(ICustomerMngtService service) {
		System.out.println("MainController:: 1 Param COnstructor");
		this.service=service;
	}
	public String processCustomer(CustomerVO vo)throws Exception{
		//convert VO class object to DTO class object
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
