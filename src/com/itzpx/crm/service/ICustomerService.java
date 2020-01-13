package com.itzpx.crm.service;

import java.util.List;

import javax.jws.WebService;

import com.itzpx.crm.domain.Customer;

@WebService
public interface ICustomerService {
	public List<Customer> findAll();
	//��ѯδ�����Ŀͻ�
	public List<Customer> findListNotAssociation();
	//��ѯ�ѹ�����ָ�������Ŀͻ�
	public List<Customer> findListHasAssociation(String decidedezone);
	//���������ͻ�
	public void assigncustomerstodecidedzone(String decidedezone,Integer[] customerIds);
	//���ݿͻ����ֻ�������ѯ�ͻ�����Ϣ
	public Customer findCustomerByTelephone(String telephone);
	//���ݿͻ���ַ��ѯ������id
	public String findDecidedzoneIdByAddress(String address);
}