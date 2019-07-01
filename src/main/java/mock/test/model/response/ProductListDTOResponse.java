package mock.test.model.response;

import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class ProductListDTOResponse {
    PopularProductDTO popularProductDTO;
    ProductDTO productDTOS;
}
