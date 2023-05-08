package my.spring.springweb.sample03;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PathController {
	// http://localhost:8080/springweb/character/detail/haha/123  (값을 변수처리해서 받겠어요)
	// @PathVariable annotation은 클라이언트 request url에 포함된 데이터를 핸들러 파라미터 값으로 받을 수 있어요!
	// @RequestParam과 유사한 기능인데 URL로부터 데이터를 받아오는 기능이에요!
	@RequestMapping(value = "/character/detail/{name}/{number}")
	public String myMethod(@PathVariable("number") int num, 
			@PathVariable String name, Model model) {
		
		if(name.equals("kakao") ) {
			if(num == 1) {
				model.addAttribute("imgname", "ryan");
			}else if(num == 2) {
				model.addAttribute("imgname", "muzicon");
			}else if(num == 3) {
				model.addAttribute("imgname", "apeach");
			}else if(num == 4) {
				model.addAttribute("imgname", "jayg");
			}else if(num == 5) {
				model.addAttribute("imgname", "frodoneo");
			}else if(num == 6) {
				model.addAttribute("imgname", "tube");
			}
		}else {
			
		}
		return "sample03/detailView";
	}
}
