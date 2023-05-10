package my.spring.springweb.sample07.point.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import my.spring.springweb.sample07.member.vo.MemberVO;

@Repository
public class PointDAOImpl implements PointDAO{
	
	@Autowired
	private SqlSession session;
	
	@Override
	public void insertPoint(MemberVO member) throws Exception {

		String statement = "myPoint.insertPoint";
		int num = session.insert(statement, member);
		
		if(num != 1) { // 처음 값을 넣는데 1이 아니라면
			throw new Exception(); // 강제적으로 exception발생해서 던지는거. 그럼 try-catch문에서 rollback이 나오게 됨
		}
	}

}
