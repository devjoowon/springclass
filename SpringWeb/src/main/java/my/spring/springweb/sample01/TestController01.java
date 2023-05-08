package my.spring.springweb.sample01;

//import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.slf4j.Logger;

@Controller
public class TestController01 {
	
//	private static final Logger logger = LoggerFactory.getLogger(TestController01.class);
	
	// 이 메서드를 handler로 만들거에요!
	// 클라이언트의 request를 처리하는 method로 만들거라는 얘기!
	@RequestMapping(value = "testController01")
	// -> http://localhost:8080/springweb/testController01 이러한 URL이 들어오면 실행하겠다~
	// 일반적으로 이 handler(Controller의 method)는  String을 리턴해요!
	// 만약 지금처럼.. 리턴타입이 void인 경우에는 request url 문자열이 전달돼요!
	// testController01 이 문자열을 이용해서 JSP를 찾아요!
	
	void myMethod() {
//		logger.debug("handler가 호출되었어요!");
	}
}
