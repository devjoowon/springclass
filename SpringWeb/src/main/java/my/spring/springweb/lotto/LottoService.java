package my.spring.springweb.lotto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LottoService {
	
	@Autowired
	LottoDAO dao;
	
	public boolean myMethod(int num) {
		boolean compareNum;
		int randomNumber = dao.createRandomNum();
		
	    if(num == randomNumber) {
	    	compareNum = true;
	    }else {
	    	compareNum = false;
	    }
	    
	    return compareNum;
	}
	
}
