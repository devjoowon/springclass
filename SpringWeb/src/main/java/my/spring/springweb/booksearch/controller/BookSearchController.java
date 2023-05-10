package my.spring.springweb.booksearch.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import my.spring.springweb.booksearch.service.BookSearchService;
import my.spring.springweb.booksearch.vo.BookSearchVO;
import my.spring.springweb.booksearch.vo.RequestVO;

@Controller
@RequestMapping(value = "booksearch")
public class BookSearchController {
	
	@Autowired
	private BookSearchService service;
	
	@PostMapping
	public String myMethod(@ModelAttribute("requestParam") RequestVO vo, Model model) {
		
		List<BookSearchVO> booksearch = service.search(vo);
		model.addAttribute("booksearch", booksearch);
		
		return "booksearch/bookSearch";
	}
}
