package kr.ac.kopo.bookshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.kopo.bookshop.dao.BookDao;
import kr.ac.kopo.bookshop.model.Book;
import kr.ac.kopo.bookshop.util.Pager;

@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	BookDao dao;

	@Override
	public List<Book> list(Pager pager) {
		int total = dao.total(pager);
		
		pager.setTotal(total);
		
		return dao.list(pager);
	}

	@Override
	public void add(Book book) {
		dao.add(book);
	}

	@Override
	public Book item(int bookid) {
		return dao.item(bookid);
	}

	@Override
	public void update(Book book) {
		dao.update(book);
	}

	@Override
	public void delete(int bookid) {
		dao.delete(bookid);
	}

	@Override
	public void dummy() {
		for(int i = 11; i < 100; i++) {
			Book book = new Book();
			
			book.setBookid(i);
			book.setBookname("도서명 " + i);
			book.setPublisher("출판사 " + i);
			book.setPrice(i * 1000);
			
			dao.add(book);
		}
	}

	@Override
	public void init() {
		for(int i = 11; i < 100; i++) {
			dao.delete(i);
		}
	}

}
