package kr.ac.kopo.bookshop.service;

import java.util.List;

import kr.ac.kopo.bookshop.model.Book;
import kr.ac.kopo.bookshop.util.Pager;

public interface BookService {

	List<Book> list(Pager pager);

	void add(Book book);

	Book item(int bookid);

	void update(Book book);

	void delete(int bookid);

	void dummy();

	void init();

}
