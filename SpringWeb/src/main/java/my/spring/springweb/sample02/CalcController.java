package my.spring.springweb.sample02;

import javax.servlet.http.HttpServletRequest;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "calc.do")
public class CalcController {
	
//	private static final Logger logger = LoggerFactory.getLogger(CalcController.class);
	
	@PostMapping
	public ModelAndView myMethod(@RequestParam(value = "num1") int num1,
			int num2, String operator) {
		
		ModelAndView mav = new ModelAndView();
		String viewName = null;		// 조건에 따라서 JSP이름이 여기에 할당돼요!
		
		if(operator.equals("/") && num2 == 0) {
			viewName = "sample02/errorResult";
			// ModelAndView객체에 addObject() method로 데이터를 추가하면 해당 데이터는 request객체에 붙어서 전달됨
			mav.addObject("msg", "나눗셈 연산은 0으로 나눌 수 없어요~");
		}else {
			int result = 0;
			if(operator.equals("+")) {
				result = num1 + num2;
			}else if(operator.equals("-")) {
				result = num1 - num2;
			}else if(operator.equals("*")) {
				result = num1 * num2;
			}else {
				result = num1 / num2;
			}
			mav.addObject("msg", result);
			viewName = "sample02/calcResult";
		}
		
		// 이전에는 View객체를 직접 생성했었어요 (InternalResourceView class를 이용)
		// 이 View객체를 이용해서 ModelAndView 객체를 생성했었어요
		mav.setViewName(viewName);
		
		return mav;
	}
}
