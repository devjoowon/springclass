package my.spring.springweb.sample07.member.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import my.spring.springweb.sample07.member.service.MemberService;
import my.spring.springweb.sample07.member.vo.MemberVO;


@Controller
@SessionAttributes(value = {"loginMember"})  // 가입한 회원에 대한 정보를 session에 저장할 것임
public class MemberController {
	
	Logger log = LogManager.getLogger("case3"); //case3은 콘솔에 출력하는 로거임 (저번에 만들어 놓음)
	
	@Autowired
	private MemberService service;
	
	// @ModelAttribute
	// 1. 클라이언트가 보내준 데이터를 command객체를 생성해서 받아들이는 역할을 해요 (command객체는 주로 VO를 이용)
	// 2. 이렇게 ModelAttribute로 받아들인 command객체는 자동적으로 Model객체에 (map형태로) 저장돼요! (addattribute하지 않아도 command객체는 자동으로 저장됨)
	//	    이때 key값은 VO 클래스의 이름을 앞글자를 소문자로 변경해서 사용해요!(기본) (ex. MemberVO라면 memberVO가 키값이 됨)
	//	    만약 저장할 key값을 변경하려면 @ModelAttribute에 value값을 명시하면 돼요!
	// 3. 이렇게 Model에 데이터를 저장할 때 만약 session에 데이터를 같이 저장하고 싶으면 @SessionAttributes를 이용하면 돼요.
	//	  @SessionAttributes의 value에 key값을 명시하면 해당 키값으로 Model에 저장되는 동시에 session에 저장돼요!
	// 4. 그런데...@SessionAttributes의 value값과 @ModelAttribute의 value값이 같으면 
	//	     기본적으로 @ModelAttribute의 역할은 session으로부터 데이터를 가져오는게 먼저에요!
	
	@ModelAttribute(value = "loginMember")
	public MemberVO createMember() {
		return new MemberVO();
	}
	
	@PostMapping(value = "tx/member")
	public String registerMemberHandler(@ModelAttribute(value = "loginMember") MemberVO member) {
		
		boolean result = service.registerMember(member);
		String viewName = "";
		
		if(result) {
			viewName = "sample07/registerSuccess";
		}else {
			viewName = "redirect:/resources/sample07/registerFail.html"; // 정적리소스를 불러올 때 redirect 사용하기 (안그러면 .html뒤에  .jsp까지 붙게됨)
		}
		
		return viewName;
	}
}
