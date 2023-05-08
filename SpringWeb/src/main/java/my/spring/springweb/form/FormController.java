package my.spring.springweb.form;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {
	
	@PostMapping(value = "/form/result")
	public String result(@RequestParam String name,
						@RequestParam String address,
						@RequestParam(value = "fruit", required = false) String[] fruits,
						Model model) {
		
		model.addAttribute("nameResult", name);
		model.addAttribute("addressResult", address);
		model.addAttribute("fruitsResult", fruits == null ? "" : String.join(", ", fruits));
		
		return "form/result";
	}
}
