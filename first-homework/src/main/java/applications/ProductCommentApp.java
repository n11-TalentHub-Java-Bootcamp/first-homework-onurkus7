package applications;

import dto.ProductCommentDto;
import entityservice.ProductCommentEntityService;

import java.util.List;

public class ProductCommentApp {
    public static void main(String[] args) {

        ProductCommentEntityService service = new ProductCommentEntityService();
        List<ProductCommentDto> productCommentList = service.findAllProductCommentByUrunId(1L);

        for (ProductCommentDto productCommentDto : productCommentList) {
            System.out.println("Product Comments: "+ productCommentDto.getYorum());
        }

    }
}
