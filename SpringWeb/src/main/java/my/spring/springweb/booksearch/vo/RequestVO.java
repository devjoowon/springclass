package my.spring.springweb.booksearch.vo;

import lombok.Data;

@Data
public class RequestVO {

    private String keyword;
    private int minPrice;
    private int maxPrice;
    private String publishDate;


}
