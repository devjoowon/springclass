package my.spring.springweb.sample01;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "testController04")
public class TestController04 {
	
//	private static final Logger logger = LoggerFactory.getLogger(TestController04.class);
	
	// 리퀘스트 매핑대신 겟메핑 써보기
	// 겟방식이 적용된 것
	@GetMapping // 이거랑
	// @RequestMapping(value = "", method = RequestMethod.GET) // 이거 같은 뜻임
	void myMethod01() {
//		logger.debug("GET방식으로 호출되었어요!");
	}
	
	@GetMapping(value = "/info")
	void myMethod03() {
//		logger.debug("GET방식으로 /info 호출되었어요!");
	}
	
	@PostMapping
	void myMethod02() {
//		logger.debug("POST방식으로 호출되었어요!");
	}
}
