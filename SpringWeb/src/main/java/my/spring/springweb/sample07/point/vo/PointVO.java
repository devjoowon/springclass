package my.spring.springweb.sample07.point.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PointVO {
	
	private int num;
	private String memberId;
	private int memberPoint;
}
