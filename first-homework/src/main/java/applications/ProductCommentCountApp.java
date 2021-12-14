package applications;

import entityservice.ProductCommentEntityService;


public class ProductCommentCountApp {
    public static void main(String[] args) {

        ProductCommentEntityService service = new ProductCommentEntityService();
        int productCommentCount = service.getProductCommentCount(2L);

        System.out.println("Product Comment Count: "+productCommentCount);

    }
}
