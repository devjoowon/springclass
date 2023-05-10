package my.spring.springweb.sample06.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import my.spring.springweb.sample06.dao.BookDAO;

@Service
public class BookService {
	
	@Autowired
	private BookDAO dao;
	
	public int getBookCount() {
		
		return dao.getCount();
	}
	
}
