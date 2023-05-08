package my.spring.springweb.sample01;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "testController03")
public class TestController03 {

//	private static final Logger logger = LoggerFactory.getLogger(TestController03.class);
	
	@RequestMapping(value = "", method = RequestMethod.GET) //method부분 명시하지 않으면 기본적으로 get방식
	void myMethod01() {
//		logger.debug("GET방식으로 호출!");
	}
	
	@RequestMapping(value = "", method = RequestMethod.POST) // post방식으로 하려면 form태그를 불러와야 함 -> 그게 귀찮음 -> 인섬니아
	void myMethod02() {
//		logger.debug("POST방식으로 호출!");
	}
}
