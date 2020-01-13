package kr.ac.kopo.bookshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.ac.kopo.bookshop.model.Customer;
import kr.ac.kopo.bookshop.service.CustomerService;
import kr.ac.kopo.bookshop.util.Pager;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	final String path = "customer/";
	
	@Autowired
	CustomerService service;
	
	@RequestMapping("/list")
	String list(Pager pager, Model model) {
		pager.setSearch( Customer.getSearch( pager.getSearchMode() ) );
		
		List<Customer> list = service.list(pager);
		
		model.addAttribute("list", list);
		
		return path + "list";
	}
	
	@RequestMapping(value="/add", method=RequestMethod.GET)
	String add() {
		return path + "add";
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	String add(Customer cust) {
		service.add(cust);
		
		return "redirect:list";
	}
	
	@RequestMapping("/delete")
	String delete(int custid) {
		service.delete(custid);
		
		return "redirect:list";
	}
	
	@RequestMapping(value="/update", method=RequestMethod.GET)
	String update(int custid, Model model) {
		Customer cust = service.item(custid);
		
		model.addAttribute("item", cust);
		
		return path + "update";
	}
	
	@RequestMapping(value="/update", method=RequestMethod.POST)
	String update(Customer cust) {
		service.update(cust);
		
		return "redirect:list";
	}
	
	@RequestMapping("/view")
	String view(int custid, Model model) {
		Customer cust = service.item(custid);
		
		model.addAttribute("view", cust);
		
		return path + "view";
	}
	
	@RequestMapping("/dummy")
	String dummy() {
		service.dummy();
		
		return "redirect:list";
	}
	
	@RequestMapping("/init")
	String init() {
		service.init();
		
		return "redirect:list";
	}
	
}
