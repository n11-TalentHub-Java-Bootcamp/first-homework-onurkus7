package dao;

import base.BaseDao;
import dto.ProductDetailDto;
import entity.Product;
import org.hibernate.query.Query;

import java.math.BigDecimal;
import java.util.List;

public class ProductDao extends BaseDao {

    public List<Product> findAll(){

        String sql = "select urun from Urun urun";

        Query query = getCurrentSession().createQuery(sql);

        return query.list();
    }

    public Product findById(Long id){

        String sql = "select urun from Urun urun where urun.id = :givenId";

        Query query = getCurrentSession().createQuery(sql);
        query.setParameter("givenId", id);

        return (Product) query.uniqueResult();
    }

    public List<Product> findAllUrunListByFiyatGeAndFiyatLe(BigDecimal fiyatGe, BigDecimal fiyatLe){

        String sql = "select urun from Urun urun where 1=1 ";

        if (fiyatGe != null){
            sql = sql + " and urun.fiyat >= :fiyatGe ";
        }

        if (fiyatLe != null){
            sql = sql + " and urun.fiyat <= :fiyatLe ";
        }

        Query query = getCurrentSession().createQuery(sql);
        query.setParameter("fiyatLe", fiyatLe);
        query.setParameter("fiyatGe", fiyatGe);

        return query.list();
    }

    public List<Product> findAllUrunListByFiyatBetween(BigDecimal fiyatGe, BigDecimal fiyatLe){

        String sql = "select urun from Urun urun where 1=1 ";

        if (fiyatGe != null && fiyatLe != null){
            sql = sql + " and urun.fiyat between :fiyatGe and :fiyatLe ";
        }

        Query query = getCurrentSession().createQuery(sql);
        query.setParameter("fiyatLe", fiyatLe);
        query.setParameter("fiyatGe", fiyatGe);

        return query.list();
    }

    public List<Product> findAllUrunByKategoriKirilim(Long kirilim) {

        String sql = " select urun from Urun urun " +
                " left join Kategori kategori  on urun.kategori.id = kategori.id " +
                " where kategori.kirilim = :kirilim ";

        Query query = getCurrentSession().createQuery(sql);
        query.setParameter("kirilim", kirilim);

        return query.list();
    }

    public List<ProductDetailDto> findAllUrunDetayDtoByKategoriKirilim(Long kirilim) {

        String sql = " select " +
                " new dto.UrunDetayDto( urun.adi, kategori.adi, urun.fiyat ) " +
                " from Urun urun " +
                " left join Kategori kategori  on urun.kategori.id = kategori.id " +
                " where kategori.kirilim = :kirilim ";

        Query query = getCurrentSession().createQuery(sql);
        query.setParameter("kirilim", kirilim);

        return query.list();
    }

}
