package my.spring.springweb.sample01;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "testController02")	//상위 경로
public class TestController02 {
	
//	private static final Logger logger = LoggerFactory.getLogger(TestController02.class);
	
	@RequestMapping(value = "/")	//하위 경로
	// -> http://localhost:8080/springweb/testController02/
	void myMethod01() {
//		logger.debug("testController02/ 호출되었어요!");
	}
	
	@RequestMapping(value = "/profile")	//하위 경로 -> 슬래쉬를 쓰면 //profile도 호출됨
	// -> http://localhost:8080/springweb/testController02/profile
	// -> http://localhost:8080/springweb/testController02//profile -> 이것도 됨 (그래서 앞에 슬래쉬 안씀!)
	void myMethod02() {
//		logger.debug("testController02/profile 호출되었어요!");
	}
	
	@RequestMapping(value = "bbs")	//하위 경로 -> 앞에 /(슬래쉬)를 빼고 적어도 자동으로 붙음 -> 섞어쓰지말기
	// -> http://localhost:8080/springweb/testController02/bbs
	void myMethod03() {
//		logger.debug("testController02/bbs 호출되었어요!");
	}
	
	@RequestMapping(value = {"", "mywork", "cook*", "test/*"})	//하위 경로 -> 스트링배열 줘보기
	// -> http://localhost:8080/springweb/testController02 (뒤에 슬래쉬도 없는 것)
	// -> http://localhost:8080/springweb/testController02/mywork
	// -> http://localhost:8080/springweb/testController02/cook으로 시작되는 모든것 (근데 cook/~~는 안됨)
	// -> http://localhost:8080/springweb/testController02/test/으로 시작되는 모든것 (근데 /test만은 안됨)
	void myMethod04() {
//		logger.debug("myMethod04 호출되었어요!");
	}
}
