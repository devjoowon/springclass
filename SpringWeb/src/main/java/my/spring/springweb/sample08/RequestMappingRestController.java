package my.spring.springweb.sample08;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController //JSON을 리턴하는 놈들만 모아둔 컨트롤러 (원래 @GetMapping밑에 @ResponseBody가 오는데 그걸 지우고 Controller를 RestController로 바꿈)
public class RequestMappingRestController {

	@GetMapping(value = "testProduces5", produces = "application/json; charset=UTF-8")
	public MemberVO myMethod07() {
		
		MemberVO member = new MemberVO("shin", "신사임당");
		
		return member;
		
	}
	// AJAX사용하는건(좋아요, 댓글같은거) ajax RestController 만들어서 분리해서 만들면 됨!
	// 일반적인 건 그냥 Controller에 하고!
}
