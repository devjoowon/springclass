package my.spring.springweb.sample01;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "testController07")
public class TestController07 {

//	private static final Logger logger = LoggerFactory.getLogger(TestController07.class);
	
	// Model 객체가 주입됨
	// Model 객체의 Scope는 당연히 requestScope에요!
	// 클라이언트가 보내준 request안에 데이터를 가져와서 같은 이름의 handler parameter에 주입
	@PostMapping(value = "useEL")
	public String myMethod(String name, String age, Model model) {
		
//		logger.debug("testController07 호출되었어요!");
		
		model.addAttribute("myName", name);
		model.addAttribute("myAge", age);
		
		return "sample01/testEL";
	}
}
