package kr.ac.kopo.bookshop.service;

import java.util.List;

import kr.ac.kopo.bookshop.model.Customer;
import kr.ac.kopo.bookshop.util.Pager;

public interface CustomerService {

	List<Customer> list(Pager pager);

	void add(Customer cust);

	void delete(int custid);

	Customer item(int custid);

	void update(Customer cust);

	void dummy();

	void init();

}
