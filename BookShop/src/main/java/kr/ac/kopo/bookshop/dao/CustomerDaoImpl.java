package kr.ac.kopo.bookshop.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.ac.kopo.bookshop.model.Customer;
import kr.ac.kopo.bookshop.util.Pager;

@Repository
public class CustomerDaoImpl implements CustomerDao {
	
	@Autowired
	SqlSession sql;

	@Override
	public List<Customer> list(Pager pager) {
		return sql.selectList("customer.list", pager);
	}

	@Override
	public void add(Customer cust) {
		sql.insert("customer.add", cust);
	}

	@Override
	public void delete(int custid) {
		sql.delete("customer.delete", custid);
	}

	@Override
	public Customer item(int custid) {
		return sql.selectOne("customer.item",custid);
	}

	@Override
	public void update(Customer cust) {
		sql.update("customer.update",cust);
	}

	@Override
	public int total(Pager pager) {
		return sql.selectOne("customer.total", pager);
	}

}
