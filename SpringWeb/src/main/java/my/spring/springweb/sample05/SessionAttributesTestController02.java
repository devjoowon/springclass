package my.spring.springweb.sample05;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
@RequestMapping(value = "sessionAttributesTest02")
public class SessionAttributesTestController02 {

	Logger log = LogManager.getLogger("case3");
	
	// data1은 Model과 Session에 둘 다 저장됩니다.
	@ModelAttribute(value = "data1")
	public String createString() {
		log.debug("문자열이 생성!");
		return "이것은 소리없는 아우성!";
	}
	
	// 그럼 session을 직접 얻어와서 사용해도 되나요?
	// session을 얻어오기 위해 request객체를 주입받아요!
	@ModelAttribute(value = "data2")
	public String createString1(HttpServletRequest request, Model model) {
		log.debug("세션을 직접 얻어올 거에요!");
		
		// 클라이언트 session객체가 존재하면 가져오고 없으면 생성해서 가져와요~
		HttpSession session = request.getSession(true);
		session.setAttribute("myMessage", "세션에 직접 얻어와서 데이터를 저장했어요!");
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
		
		return "sample05/sessionResult02";
		
	}
}
