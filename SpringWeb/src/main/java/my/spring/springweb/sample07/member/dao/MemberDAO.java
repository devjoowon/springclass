package my.spring.springweb.sample07.member.dao;

import org.springframework.stereotype.Repository;

import my.spring.springweb.sample07.member.vo.MemberVO;

@Repository
public interface MemberDAO {

	public void insertMember(MemberVO member) throws Exception;
}