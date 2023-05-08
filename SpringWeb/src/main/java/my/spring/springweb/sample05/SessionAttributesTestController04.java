package my.spring.springweb.sample05;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import my.spring.springweb.sample05.vo.User;

@Controller
@SessionAttributes(value = {"newUser"})	// 세션에 저장됨	2.세션에도 빈객체 저장하고
@RequestMapping(value = "sessionAttributesTest04")
public class SessionAttributesTestController04 {
	
	@ModelAttribute("newUser")	// 모델에 저장됨 1. 빈객체 만듦
	public User createNewUser() {
		User user = new User();
		return user;
	}
	
	// handler 만들기
	@PostMapping(value = "")
	public String handler(@ModelAttribute("newUser") User userVO) {//3. newUser라는 키값으로 모델에 저장, 세션에 저장
		
		return "sample05/sessionResult04";
	}
	
	@GetMapping(value = "complete")
	public String handler01(SessionStatus sessionStatus) {
		
		// session은 클라이언트 정보를 지속적으로 유지할 수 있도록 저장장소를 제공하는거에요!
		// session안에 데이터가 지속적으로 쌓이는 문제가 발생해요! (session이 만료될 때 까지 혹은 session의 어떤 키값을 명시적으로 삭제할 때 까지)
		// 메모리를 많이 사용하게 돼요. session안에 사용하지 않는 데이터도 지속적으로 가지고 있기 때문이죠.
		// 명시적으로 데이터를 없앨 수 있어요 => request객체로부터 session객체를 얻어와서 처리해야 해요! (request.getSession해서 얻어와서 remove해야 함)
		// 그런데 지금 우리는 이렇게 session을 request로부터 얻어와서 처리하는 작업을 하고 있지 않아요!
		// 그래서 session안에 저장되어 있는 데이터를 지울(만료시킬) 수 있는 기능이 따로 제공돼요!
		
		// setComplete 메소드는 세션 안의 모든 데이터를 없애는 게 아니에요!
		// 현재 컨트롤러 안에서 세션에 저장된 놈들만 날리고, 다른 컨트롤러에 의해 세션에 저장된 거는 건들지 않음
		// 현재 controller에 의해서 저장된 세션 안의 데이터만 삭제해요!
		sessionStatus.setComplete();
		
		return "sample05/sessionResult04";
	}
}
