package kr.ac.kopo.bookshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.kopo.bookshop.dao.ReviewDao;
import kr.ac.kopo.bookshop.model.Review;
import kr.ac.kopo.bookshop.util.Pager;

@Service
public class ReviewServiceImpl implements ReviewService {
	
	@Autowired
	ReviewDao dao;

	@Override
	public int add(Review item) {
		return dao.add(item);
	}

	@Override
	public List<Review> list(int bookid) {
		Pager pager = new Pager();
		
		pager.setSearch("bookid");
		pager.setKeyword( String.valueOf(bookid) );
		
		return dao.list(pager);
	}

}
