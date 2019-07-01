package mock.test.model.response;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class ProductsParametersDTO {

    private String flavour;
    private Integer rate;
    private Boolean decaf;
    private String coffeeType;
}
