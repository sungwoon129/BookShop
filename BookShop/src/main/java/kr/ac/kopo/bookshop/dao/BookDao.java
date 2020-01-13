package kr.ac.kopo.bookshop.dao;

import java.util.List;

import kr.ac.kopo.bookshop.model.Book;
import kr.ac.kopo.bookshop.util.Pager;

public interface BookDao {

	List<Book> list(Pager pager);

	void add(Book book);

	Book item(int bookid);

	void update(Book book);

	void delete(int bookid);

	int total(Pager pager);

}
