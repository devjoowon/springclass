package my.spring.springweb.sample07.member.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MemberVO {

	private String memberId;
	private String memberPw;
	private String memberName;
}
