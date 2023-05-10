package my.spring.springweb.sample06.vo;

import lombok.Data;

@Data
public class BookVO {

    private String keyword;
    private int minPrice;
    private int maxPrice;
    private String publishDate;
	
}

