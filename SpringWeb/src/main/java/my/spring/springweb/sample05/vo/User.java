package my.spring.springweb.sample05.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
	
	private String userNumber;
	private String userName;
	private String userDept;
	
}
