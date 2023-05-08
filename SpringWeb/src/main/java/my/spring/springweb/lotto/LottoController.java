package my.spring.springweb.lotto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LottoController {
	
	@Autowired
	LottoService service;
	
	@RequestMapping(value = "/lotto/{number}")
	public String myMethod(@PathVariable("number") int num, Model model) {
        
		boolean compareNum = service.myMethod(num);
        model.addAttribute("lottoResult", compareNum);
        
		return "lotto/result";
	}
	
	
}
