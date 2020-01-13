package kr.ac.kopo.bookshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.ac.kopo.bookshop.model.Review;
import kr.ac.kopo.bookshop.service.ReviewService;

@RestController //이 컨트롤러에 있는 메소드를 전부 @ResponseBody를 단 것과 똑같이 동작하게 한다
public class ReviewController {
	
	@Autowired
	ReviewService service;
	
	@RequestMapping("/review/add")
	String add(Review item) {
		return String.valueOf(service.add(item));
	}
	
}
