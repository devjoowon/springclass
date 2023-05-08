package my.spring.springweb.sample02;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Member {
	// 자바 빈 규약으로 vo 만들기
	// 넘어오는 클라이언트의 리퀘스트 키 값과 동일해야 함
	// 커멘드객체를 사용할 때 vo만들어서 사용함
	// 퍼블릭으로 잡혀있는 모든 생성자 중에 
	private String id;
	private String password;
	private String name;
	private String tel;
	
}
