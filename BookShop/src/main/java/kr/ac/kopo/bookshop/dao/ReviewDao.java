package kr.ac.kopo.bookshop.dao;

import java.util.List;

import kr.ac.kopo.bookshop.model.Review;
import kr.ac.kopo.bookshop.util.Pager;

public interface ReviewDao {

	int add(Review item);

	List<Review> list(Pager pager);

}
