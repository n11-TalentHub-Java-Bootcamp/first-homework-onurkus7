package entityservice;

import dao.ProductCommentDao;
import dto.UserCommentDto;
import dto.ProductCommentDto;
import entity.ProductComment;

import java.util.List;

public class ProductCommentEntityService {
    private ProductCommentDao productCommentDao;

    public ProductCommentEntityService() {
        productCommentDao = new ProductCommentDao();
    }

    public List<ProductComment> findAll(){
        return productCommentDao.findAll();
    }

    public List<ProductCommentDto> findAllProductCommentByUrunId(Long urunId) {
        return productCommentDao.findAllProductCommentByUrunId(urunId);}

    public int getProductCommentCount(Long urunId) {
        return productCommentDao.getProductCommentCount(urunId);}

    public List<UserCommentDto> findAllUserCommentByKullaniciId(Long kullaniciId) {
        return productCommentDao.findAllUserCommentByKullaniciId(kullaniciId);}


    }
