package kr.ac.kopo.bookshop.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.ac.kopo.bookshop.model.Book;
import kr.ac.kopo.bookshop.util.Pager;

@Repository
public class BookDaoImpl implements BookDao {
	
	@Autowired
	SqlSession sql;

	@Override
	public List<Book> list(Pager pager) {
		return sql.selectList("book.list", pager);
	}

	@Override
	public void add(Book book) {
		sql.insert("book.add", book);
	}

	@Override
	public Book item(int bookid) {
		return sql.selectOne("book.item", bookid);
	}

	@Override
	public void update(Book book) {
		sql.update("book.update", book);
	}

	@Override
	public void delete(int bookid) {
		sql.delete("book.delete", bookid);
	}

	@Override
	public int total(Pager pager) {
		return sql.selectOne("book.total", pager);
	}

}
