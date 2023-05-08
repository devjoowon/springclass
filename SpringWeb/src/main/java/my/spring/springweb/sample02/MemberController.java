package my.spring.springweb.sample02;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MemberController {
	
	@PostMapping(value = "member1")
	public ModelAndView myMethod01(String id, String password,
			@RequestParam(value = "name", defaultValue = "없음") String name, String tel) {
		ModelAndView mav = new ModelAndView();
		//request객체에 붙여서 보내요!
		mav.addObject("id", id);
		mav.addObject("password", password);
		mav.addObject("name", name);
		mav.addObject("tel", tel);
		
		mav.setViewName("sample02/memberResult");
		return mav;
	}
	
	@PostMapping(value = "member2")
	public ModelAndView myMethod02(Member vo) {
		// 만들어진 객체는 우리가 command객체라고 불러요!
		// 당연한 말이지만, 이런 command객체를 이용할 때는 거의 VO를 사용해요~
		// 중요한 특징이 하나 있는데 이렇게 command객체가 handler의 인자로 들어와서 사용될 경우, 이 command객체는 자동으로 Model에 붙어요!
		// 이때 key값은 클래스 이름을 그대로 사용하는데 앞글자를 소문자로 바꾸어서 사용해요!
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("memberVO", vo);
		mav.setViewName("sample02/memberResult");
		
		return mav;
	}
	
	@PostMapping(value = "member3")
	public String myMethod03(@ModelAttribute(name = "myVO") Member vo) {
		
		return "sample02/memberResult";	// 이렇게 jsp로 바로 땡겨쓰기 가능
	}
}
