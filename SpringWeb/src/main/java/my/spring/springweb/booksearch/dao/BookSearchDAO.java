package my.spring.springweb.booksearch.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import my.spring.springweb.booksearch.vo.BookSearchVO;
import my.spring.springweb.booksearch.vo.RequestVO;

@Repository
public class BookSearchDAO {
	
	@Autowired
	SqlSession session;
	
	public List<BookSearchVO> search(RequestVO vo) {
		String statement = "myBook.selectByKeyword";
		List<BookSearchVO> result = session.selectList(statement, vo); 
		return result;
	}
	
}
