package kr.ac.kopo.bookshop.service;

import java.util.List;

import kr.ac.kopo.bookshop.model.Review;

public interface ReviewService {

	int add(Review item);

	List<Review> list(int bookid);

}
