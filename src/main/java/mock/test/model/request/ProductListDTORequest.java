package mock.test.model.request;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter @Getter
@Builder
public class ProductListDTORequest {

    private Integer page;
    private Integer results;
    private String search;
    private Double minPrice;
    private Double maxPrice;
    private String sortByDTORequestEnum;

    ProductCharacteristicsDTORequest productCharacteristicsDTORequest;
}
