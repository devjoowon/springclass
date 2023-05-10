package my.spring.springweb.booksearch.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BookSearchVO {
	
	private String bimgurl; 
	private String btitle;  
	private String bauthor;  
	private int bprice;  
	private String bdate;  
	
}

