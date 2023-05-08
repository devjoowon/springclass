package my.spring.springweb.sample02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "redirect")
public class RedirectController {
	
	@GetMapping
	public String myMethod() {
		
		// 리턴되는 문자열을 이용해서 View Resolver가 동작해서 JSP를 찾아 View객체로 생성 (우리가 원래 하는 작업)
		// 만약 문자열이 아래처럼 나가면 조금 다르게 동작해요!
		// redirect를 사용해 보아요!
		// redirect:/ => http://localhost:8080/springweb/
		String result = "redirect:/resources/test.html";
		return result;
	}
}
