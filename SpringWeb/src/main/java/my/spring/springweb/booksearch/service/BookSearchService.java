package my.spring.springweb.booksearch.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import my.spring.springweb.booksearch.dao.BookSearchDAO;
import my.spring.springweb.booksearch.vo.BookSearchVO;
import my.spring.springweb.booksearch.vo.RequestVO;

@Service
public class BookSearchService {
	
	@Autowired
	private BookSearchDAO dao;
	
	public List<BookSearchVO> search(RequestVO vo){
		
		return dao.search(vo);
	}
	
	
}