package my.spring.springweb.sample01;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.InternalResourceView;

@Controller
@RequestMapping(value = "testController06")
public class TestController06 {
	
//	private static final Logger logger = LoggerFactory.getLogger(TestController06.class);
	
	@GetMapping(value = "showView")
	public ModelAndView myMethod01() {
		
//		logger.debug("testController06/showView 호출되었어요!");
		
		// 스프링이 제공해주는 view 구현체
		//resources/sample01 안에 html 만들 것임
		// html을 이용해서 view 객체를 만들 것임
															// html의 경로 작성해주기
		InternalResourceView view = new InternalResourceView("/resources/sample01/staticView.html");
		
		// 직접적으로 전달이 안되기 때문에 ModelAndView객체에 붙여서 보냄
		ModelAndView mav = new ModelAndView(view);
		
		return mav;
	}
}
