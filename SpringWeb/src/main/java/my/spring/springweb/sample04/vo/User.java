package my.spring.springweb.sample04.vo;
// vo 클래스 만들기

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

	private int userNumber;
	private String userName;
	private String userDept;
}
