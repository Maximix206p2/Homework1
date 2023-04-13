package products;

import lombok.AllArgsConstructor;
import lombok.Data;

//thymeleaf or freemarker
@Data
@AllArgsConstructor
public class Product {
    private Long id;
    private String code;
    private String name;
    private String image;
}
