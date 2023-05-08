package my.spring.springweb.sample01;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "testController05")
public class TestController05 {
	
//	private static final Logger logger = LoggerFactory.getLogger(TestController05.class);
	
				// value 말고 params 써보기 //파라미터에 userName 키가 있으면 호출됨
	@GetMapping(params = "userName=hong")	// testController05라는 리퀘스트url 겟방식 쿼리스트링에 파라미터 아이디로 userName이 있으면 이거 호출해
	void myMethod01() {
//		logger.debug("GET방식으로 호출되었어요!");
	}
}
