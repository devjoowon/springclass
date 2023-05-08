package my.spring.springweb.lotto;

import java.util.Random;

import org.springframework.stereotype.Repository;

@Repository
public class LottoDAO {
	
	public int createRandomNum() {
		Random random = new Random();
        int randomNumber = random.nextInt(6) + 1; // 1부터 6까지의 수 중에서 랜덤하게 하나를 선택합니다.
        System.out.println("랜덤한 수: " + randomNumber);
        
        return randomNumber;
	}
}
