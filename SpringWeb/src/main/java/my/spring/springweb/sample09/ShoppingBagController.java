package my.spring.springweb.sample09;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import my.spring.springweb.sample09.vo.ShoppingBagVO;

@Controller
@SessionAttributes(value = {"shoppingBag"})
@RequestMapping(value = "/shoppingBag")
public class ShoppingBagController {
	
	@ModelAttribute(value = "shoppingBag")
	public ShoppingBagVO createShoppingBag() {
		// 세션에 shoppingBag이 없으면 만들어주는 메서드
//		HttpSession session = request.getSession(true);
//		ShoppingBagVO vo = (ShoppingBagVO) session.getAttribute("shoppingBag");
//		if(vo == null) {
//			vo = new ShoppingBagVO();
//			session.setAttribute("shoppingBag", vo);
//		}
		return new ShoppingBagVO(1);
	}
	
	@GetMapping("/{fruit}")
	public void addShoppingBag(@PathVariable("fruit") String fruit, @ModelAttribute("shoppingBag") ShoppingBagVO vo) {
		vo.setCount(vo.getCount() + 1);
		System.out.println(vo.getCount());
		System.out.println(fruit);
	}
}

// cart, item, shoppingbag, product
// apple 1
// banana 2
// halabong 3