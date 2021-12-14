package dao;

import base.BaseDao;
import dto.UserCommentDto;
import dto.ProductCommentDto;
import entity.ProductComment;
import org.hibernate.query.Query;


import java.util.List;

public class ProductCommentDao extends BaseDao {

    public List<ProductComment> findAll(){

        Query query = getCurrentSession().createQuery(
                "select productComment from ProductComment productComment");

        return query.list();
    }
    public List<ProductCommentDto> findAllProductCommentByUrunId(Long urunId) {

        String sql = " select " +
                " new dto.ProductCommentDto(productComment.yorum) " +
                " from ProductComment productComment " +
                " where productComment.product.id = :urunId ";


        Query query = getCurrentSession().createQuery(sql);
        query.setParameter("urunId", urunId);

        return query.list();
    }

    public int getProductCommentCount(Long urunId) {


        String sql = " select new dto.ProductCommentCountDto ( productComment.product.id ) " +
                " from ProductComment productComment " +
                " where productComment.product.id = :urunId ";

        Query query = getCurrentSession().createQuery(sql);
        query.setParameter("urunId", urunId);

        if(query.list().isEmpty())
            return 0;
        else return query.list().size();

    }
    public List<UserCommentDto> findAllUserCommentByKullaniciId(Long kullaniciId) {

        String sql = " select " +
                " new dto.UserCommentDto ( productComment.yorum ) " +
                " from ProductComment productComment " +
                " where productComment.user.id = :kullaniciId ";


        Query query = getCurrentSession().createQuery(sql);
        query.setParameter("kullaniciId", kullaniciId);

        return query.list();

    }
}
