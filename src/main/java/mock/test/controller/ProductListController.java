package mock.test.controller;

import mock.test.model.request.ProductListDTORequest;
import mock.test.model.response.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequestMapping("api")
public class ProductListController {

    @PostMapping("products")
    public List<ProductListDTOResponse> getProductList(@RequestBody ProductListDTORequest productListDTORequest) {
        return Stream.of(ProductListDTOResponse.builder().popularProductDTO(PopularProductDTO.builder()
                .productDTO(ProductDTO.builder()
                        .productId(147852).title("Third").shortDescription("Some third description")
                        .type("Coffee").previewImage("Base64").price(16.45).inStockCount(32)
                        .productsParametersDTO(ProductsParametersDTO.builder()
                                .flavour("strong").rate(2).decaf(true).coffeeType("arabika")
                                .build())
                        .build())
                .build())
                .productDTOS(
                        ProductDTO.builder()
                                .productId(12345).title("First").shortDescription("Some first description")
                                .type("Coffee").previewImage("Base64").price(78.25).inStockCount(78)
                                .productsParametersDTO(ProductsParametersDTO.builder()
                                        .flavour("strong").rate(1).decaf(false).coffeeType("arabika")
                                        .build())
                                .build()
                ).build()).collect(Collectors.toList());
    }
}
