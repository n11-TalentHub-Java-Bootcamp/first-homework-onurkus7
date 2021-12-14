package dao;

import base.BaseDao;
import entity.Kategory;
import org.hibernate.query.Query;

import java.util.List;

public class KategoryDao extends BaseDao {

    public List<Kategory> findAll(){

        Query query = getCurrentSession().createQuery(
                "select kategori from Kategory kategori");

        return query.list();
    }
}
