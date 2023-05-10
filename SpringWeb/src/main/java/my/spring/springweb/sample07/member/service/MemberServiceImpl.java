package my.spring.springweb.sample07.member.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import my.spring.springweb.sample07.member.dao.MemberDAO;
import my.spring.springweb.sample07.member.vo.MemberVO;
import my.spring.springweb.sample07.point.dao.PointDAO;

@Service
public class MemberServiceImpl implements MemberService {
	
	Logger log = LogManager.getLogger("case3");
	
	// Service단에서 Transaction처리를 해야해요!
	// TransactionManager를 이용해서 Transaction을 처리할 거에요! 당연히 주입받아요!
	@Autowired
	private PlatformTransactionManager transactionManager;
	
	// 데이터베이스 처리하려면 DAO가 있어야 해요!
	@Autowired private MemberDAO memberDao;
	@Autowired private PointDAO pointDao;
	
	
	@Override
	public boolean registerMember(MemberVO member) {
		
		// 일반적인 로직처리는 필요없어요!
		// 데이터베이스 처리를 해야 하고.. 가만히 보니.. select계열이 아니에요!
		// Transaction처리를 해야해요!
		
		// Transaction을 시작해요! (commit과 rollback이 나오기 전까지 나온 sql문들이 다 하나의 단일작업으로 처리 된다)
		TransactionStatus txStatus = 
				transactionManager.getTransaction(new DefaultTransactionDefinition());  //뒤에는 트랜잭선을 어떻게 지정할지에 대한 설정이 나옴
		
		boolean result = false;
		
		try {
			memberDao.insertMember(member);
			pointDao.insertPoint(member);
			
			// 여기까지 코드가 왔단 얘기는 둘다 처리가 제대로 됐다는 말, 정상적으로 처리가 됐으니 여기에서 commit처리를 하면 됨!
			// exception 발생 여부에 따라 트랜잭션 처리
			result = true;
			transactionManager.commit(txStatus);
			
		} catch (Exception e) {
			result = false;
			transactionManager.rollback(txStatus);
		}
		
		return result;
	}

}
