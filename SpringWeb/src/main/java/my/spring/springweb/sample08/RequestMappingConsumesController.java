package my.spring.springweb.sample08;

import java.io.PrintWriter;
import java.nio.charset.Charset;

import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;

@Controller
public class RequestMappingConsumesController {

	Logger log = LogManager.getLogger("case3");

	@RequestMapping(value = "testConsumes1", consumes = { "application/xml", "application/json" })
	public String myMethod01() {

		log.debug("호출되었어요!!");

		return null;
	}

	@PostMapping(value = "testConsumes2", consumes = { "application/xml", "application/json",
			"application/x-www-form-urlencoded" })
	public String myMethod02() {

		log.debug("myMethod02 호출되었어요!");

		return null;
	}

	@GetMapping(value = "testProduces1", produces = "application/json; charset=UTF-8")
	public String myMethod03() {

		log.debug("myMethod03 호출되었어요!");

		return "sample08/requestMappingProducesView";
	}

	@GetMapping(value = "testProduces2", produces = "application/json; charset=UTF-8")
	public void myMethod04(HttpServletResponse response) {

		log.debug("myMethod04 호출되었어요!");
		try {
			// 이 방식은 servlet 구현에서 사용하는 방식이구요. Spring에서는 이렇게 사용하지 않아요!
			response.setContentType("application/json; charset=UTF-8");
			PrintWriter out = response.getWriter();
			// JSON을 보내줄거에요!
			MemberVO member = new MemberVO("hong", "홍길동");
			// 만들어진 VO(객체)를 JSON으로 변환할거에요! => Gson

			Gson gson = new Gson();

			String jsonStr = gson.toJson(member);

			out.println(jsonStr);
			out.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	// 이걸 더 많이 사용
	@GetMapping(value = "testProduces3", produces = "text/html; charset=UTF-8")
	@ResponseBody
	public String myMethod05() {
		
		log.debug("myMethod05 호출되었어요!");
		
		return "<h1>컨트롤러에서 직접 문자열을 리턴해줘요!</h1>";
		
	}
	
	// 정형화 된 코드는 이건데 (RESTful)
	@GetMapping(value = "testProduces4")
	@ResponseBody
	public ResponseEntity<String> myMethod06() {
		
		log.debug("myMethod06 호출되었어요!");
		
		String message = "<h1>이것은 소리없는 아우성!</h1>";
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(new MediaType("text","html",Charset.forName("UTF-8")));
		
		return new ResponseEntity<String>(message,headers,HttpStatus.OK); //바로 위에거는 상태정보가 안들어감, 여기에는 상태코드가 들어감 (404,403,415,..등)
		
	}
	
	//JSON으로 알아서 바꿔줌 !!!!! (이러한 기능이 스프링 안에 내장되어 있음) 이게 최종이구나..
	@GetMapping(value = "testProduces5", produces = "application/json; charset=UTF-8")
	@ResponseBody
	public MemberVO myMethod07() {
		
		log.debug("myMethod07 호출되었어요!");
		MemberVO member = new MemberVO("shin", "신사임당");
		
		return member;
		
	}
}
