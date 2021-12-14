package applications;

import dto.UserCommentDto;
import entityservice.ProductCommentEntityService;

import java.util.List;

public class UserCommentApp {
    public static void main(String[] args) {
        ProductCommentEntityService service = new ProductCommentEntityService();
        List<UserCommentDto> userCommentList = service.findAllUserCommentByKullaniciId(1L);

        for (UserCommentDto userCommentDto : userCommentList) {
            System.out.println("User Comments: "+userCommentDto.getYorum());
        }

    }
}
