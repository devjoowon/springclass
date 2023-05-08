package my.spring.springweb.sample04;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import my.spring.springweb.sample04.vo.User;

@Controller
public class ModelController {
	
	Logger log = LogManager.getLogger("case3");
	
	// 밑에 있는 메서드는 handler가 호출되기 전에 호출됨
	// 리턴되는 결과가 Model 객체에 저장됨, 그래서 키값을 줘야 함
	@ModelAttribute(value = "v1")
	public String createString() {
		log.debug("문자열 객체를 생성해요!");
		return "이것은 소리없는 아우성!";
	}
	
	@ModelAttribute(value = "v2")
	public int[] createArray() {
		log.debug("배열을 저장해요!");
		return new int[] {10, 20, 30};
	}
	
	@ModelAttribute(value = "v3")
	public User createVO() {
		log.debug("VO를 저장해요!");
		User user = new User(200, "홍길동", "개발팀");
		return user;
	}
	
	@ModelAttribute(value = "data1")
	public int createInt01() {
		log.debug("숫자 100을 저장해요!");
		return 100;
	}
	
	@ModelAttribute(value = "data2")
	public int createInt02() {
		log.debug("숫자 200을 저장해요!");
		return 200;
	}
	
	@RequestMapping(value = "modelAttributeTest01")
	public String myMethod001() {
		log.debug("핸들러가 호출되었어요!");
		return "sample04/modelResult";
	}
	
	@RequestMapping(value = "modelAttributeTest02")
	public String myMethod002(@ModelAttribute(value = "data1" ) int num1,
			@ModelAttribute(value = "data2" )int num2) {
		log.debug("아하.. 이렇게 사용할 수도 있군요!");
		log.debug(num1 + ", " + num2);
		return "sample04/modelResult";
	}
}
