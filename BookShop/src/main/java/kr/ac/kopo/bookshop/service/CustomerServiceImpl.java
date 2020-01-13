package kr.ac.kopo.bookshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.kopo.bookshop.dao.CustomerDao;
import kr.ac.kopo.bookshop.model.Customer;
import kr.ac.kopo.bookshop.util.Pager;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	CustomerDao dao;

	@Override
	public List<Customer> list(Pager pager) {
		int total = dao.total(pager);
		
		pager.setTotal(total);
		
		return dao.list(pager);
	}

	@Override
	public void add(Customer cust) {
		dao.add(cust);
	}

	@Override
	public void delete(int custid) {
		dao.delete(custid);
	}

	@Override
	public Customer item(int custid) {
		return dao.item(custid);
	}

	@Override
	public void update(Customer cust) {
		dao.update(cust);
	}

	@Override
	public void dummy() {
		for(int i = 6; i < 100; i++) {
			Customer customer = new Customer();
			
			customer.setCustid(i);
			customer.setName("유령회원" + i);
			customer.setAddress("가짜주소" + i);
			customer.setPhone("대포폰" + i);
			
			dao.add(customer);
		}
	}

	@Override
	public void init() {
		for(int i = 6; i < 100; i++) {
			dao.delete(i);
		}
	}

}
