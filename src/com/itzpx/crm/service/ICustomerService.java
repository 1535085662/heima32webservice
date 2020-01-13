package com.itzpx.crm.service;

import java.util.List;

import javax.jws.WebService;

import com.itzpx.crm.domain.Customer;

@WebService
public interface ICustomerService {
	public List<Customer> findAll();
	//查询未关联的客户
	public List<Customer> findListNotAssociation();
	//查询已关联到指定地区的客户
	public List<Customer> findListHasAssociation(String decidedezone);
	//定区关联客户
	public void assigncustomerstodecidedzone(String decidedezone,Integer[] customerIds);
	//根据客户的手机号来查询客户的信息
	public Customer findCustomerByTelephone(String telephone);
	//根据客户地址查询定区的id
	public String findDecidedzoneIdByAddress(String address);
}