package kr.ac.kopo.bookshop.model;

import java.util.Date;

public class Review {
	int reviewid;
	String review;
	int bookid;
	Date reviewdate;

	public int getReviewid() {
		return reviewid;
	}

	public void setReviewid(int reviewid) {
		this.reviewid = reviewid;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public Date getReviewdate() {
		return reviewdate;
	}

	public void setReviewdate(Date reviewdate) {
		this.reviewdate = reviewdate;
	}

}
