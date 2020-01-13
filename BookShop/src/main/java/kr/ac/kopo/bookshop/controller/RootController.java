package kr.ac.kopo.bookshop.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class RootController {
	
	@RequestMapping("/")
	String index() {
		return "index";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	String login() {
		return "login";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	String login(String id, String password, HttpSession session) {
		if(id.equals("book") && password.equals("1234")) {
			session.setAttribute("user", id);
			//로그인하는 아이디와 비밀번호가 맞으면 세션에 로그인이 되었다고 설정한다
		}
		
		return "redirect:/";
	}
	
	@RequestMapping("/logout")
	String logout(HttpSession session) {
		session.invalidate();
		//세션에 (유효한날짜) 있는 건 전부 무효 깨끗이 비운다
		
		return "redirect:/";
	}

}
