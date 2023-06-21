package com.nit.service;

import com.nit.bo.CustomerBo;
import com.nit.dao.ICustomerDAO;
import com.nit.dto.CustomerDTO;

public class CustomerMngtServiceImpl implements ICustomerMngtService {
	
	//Has A Property
	private ICustomerDAO dao;
	
	public CustomerMngtServiceImpl(ICustomerDAO dao) {
		System.out.println("CustomerMngtServiceImpl- 1 param constructor");
		this.dao=dao;
	}//constructor

	@Override
	public String registerCustomer(CustomerDTO dto)  throws Exception{
		System.out.println("CustomerMngtServiceImpl.registerCustomer()");
		//write b.logic to
		//calculate interest
		double intamnt=(dto.getPamnt()*dto.getRate()*dto.getTime())/100.0;
		
		//prepare CustomerBO class object hVING Persistable data
		CustomerBo custBO=new CustomerBo();
		custBO.setCname(dto.getCname());
		custBO.setCadd(dto.getCadd());
		custBO.setPamnt(dto.getPamnt());
		custBO.setIntramt(intamnt);
		//use DAO
		int count=dao.insert(custBO);
		
		//process the result
		return count==0?"Registration failed":"Registration succedded:: Interest Amount:: "+intamnt;
	}

}
