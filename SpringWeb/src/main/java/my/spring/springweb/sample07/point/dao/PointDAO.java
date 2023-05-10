package my.spring.springweb.sample07.point.dao;

import org.springframework.stereotype.Repository;

import my.spring.springweb.sample07.member.vo.MemberVO;

@Repository
public interface PointDAO {
	
	public void insertPoint(MemberVO member) throws Exception;
}
