package kr.ac.kopo.bookshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.ac.kopo.bookshop.model.Book;
import kr.ac.kopo.bookshop.model.Review;
import kr.ac.kopo.bookshop.service.BookService;
import kr.ac.kopo.bookshop.service.ReviewService;
import kr.ac.kopo.bookshop.util.Pager;

@Controller
@RequestMapping("/book")
public class BookController {
	
	@Autowired
	BookService service;
	
	@Autowired
	ReviewService res;
	
	@RequestMapping("/list")
	String list(Pager pager, Model model) {
		
		pager.setSearch( Book.getSearch( pager.getSearchMode() ) );
		
		List<Book> list = service.list(pager);
		
		model.addAttribute("list",list);
		
		return "list";
	}
	
	@RequestMapping(value="/add", method=RequestMethod.GET)
	String add() {
		return "add";
	}
	
	@RequestMapping(value="/add", method= RequestMethod.POST)
	String add(Book book) {
		service.add(book);
		
		return "redirect:list";
	}
	
	@RequestMapping(value="/update", method=RequestMethod.GET)
	String update(int bookid, Model model) {
		Book book = service.item(bookid);
		
		model.addAttribute("item", book);
		
		return "update";
	}
	
	@RequestMapping(value="/update", method=RequestMethod.POST)
	String update(Book book) {
		service.update(book);
		
		return "redirect:list";
	}
	
	@RequestMapping("/delete")
	String delete(int bookid) {
		service.delete(bookid);
		
		return "redirect:list";
		//request를 보내오면  list라는 리퀘스트를 다시 보내라고 해서 list를 연다
	}
	
	@RequestMapping("/init")
	String init() {
		service.init();
		
		return "redirect:list";
	}
	
	@RequestMapping("/dummy")
	String dummy() {
		service.dummy();
		
		return "redirect:list";
	}
	
	@RequestMapping("/view")
	String view(int bookid, Model model) {
		Book book = service.item(bookid);
		
		model.addAttribute("view", book);
		
		List<Review> review = res.list(bookid);
		model.addAttribute("reviews", review);
		
		return "view";
	}
	
}
