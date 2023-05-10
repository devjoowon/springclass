package my.spring.springweb.sample06.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import my.spring.springweb.sample06.service.BookService;

@Controller
@RequestMapping(value = "book")
public class BookController {
	
	@Autowired
	private BookService service;
	
	@GetMapping(value = "count")
	public String countBookHandler(Model model) {
		
		int count = service.getBookCount();
		model.addAttribute("count", count);
		
		return "sample06/book";
	}
}
