package my.spring.springweb.sample05;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import my.spring.springweb.sample05.vo.User;

@Controller
@SessionAttributes(value = {"data1"})
@RequestMapping(value = "sessionAttributesTest01")
public class SessionAttributesTestController01 {

	Logger log = LogManager.getLogger("case3");
	
	@ModelAttribute(value = "data1")
	public String createString() {
		log.debug("문자열이 생성!");
		return "이것은 소리없는 아우성!";
	}
	
	@ModelAttribute(value = "data2")
	public String createString1() {
		log.debug("두번째 문자열이 생성!");
		return "이건 두번째 문자열이에요!";
	}
	
	@PostMapping
	public String myMethod(@ModelAttribute("data1") String str1,
			@ModelAttribute("data2") String str2,
			@RequestParam(value = "msg") String requestMsg,
			@ModelAttribute("newUser") User userVO, Model model){
		
		log.debug("str1과 str2의 값 : " + str1 + ", " + str2);
		log.debug("msg : " + requestMsg);
		log.debug("user : " + userVO);
		
		return "sample05/sessionResult01";
		
	}
}
