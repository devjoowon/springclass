package my.spring.springweb.sample06.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.PlaceholderConfigurerSupport;
import org.springframework.objenesis.strategy.PlatformDescription;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import my.spring.springweb.sample06.vo.BookVO;

@Repository
public class BookDAO {
	
	@Autowired
	SqlSession session;
	
	@Autowired
	private PlatformTransactionManager transactionManager;
	
	public int getCount() {
		// Database 처리!
		String statement = "myBook.countBooks";
		
		int count = session.selectOne(statement);
		return count;
	}
	
	public List<BookVO> getList(BookVO book){
		
		String statement = "myBook.getBooksByCondition";
		
		// transaction을 시작하면 돼요!
		TransactionStatus txStatus = transactionManager.getTransaction(new DefaultTransactionDefinition());
		
		List<BookVO> list = session.selectList(statement, book);
		// 여러개의 session을 이용한 SQL구문을 실행시켜요! (insert, update, delete)
		// 결과를 보고 commit, rollback을 처리하면 돼요!
		
		transactionManager.commit(txStatus);
		transactionManager.rollback(txStatus);
		
		return list;
		
	}
}
