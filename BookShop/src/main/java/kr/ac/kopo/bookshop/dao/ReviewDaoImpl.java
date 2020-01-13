package kr.ac.kopo.bookshop.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.ac.kopo.bookshop.model.Review;
import kr.ac.kopo.bookshop.util.Pager;

@Repository
public class ReviewDaoImpl implements ReviewDao {
	
	@Autowired
	SqlSession sql;

	@Override
	public int add(Review item) {
		return sql.insert("review.add", item);
	}

	@Override
	public List<Review> list(Pager pager) {
		return sql.selectList("review.list", pager);
	}

}
