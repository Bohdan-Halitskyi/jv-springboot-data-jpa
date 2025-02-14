package mate.academy.springboot.datajpa.dto.response;

import java.math.BigDecimal;
import lombok.Setter;

@Setter
public class ProductResponseDto {
    private Long id;
    private String title;
    private BigDecimal price;
    private Long categoryId;
}
