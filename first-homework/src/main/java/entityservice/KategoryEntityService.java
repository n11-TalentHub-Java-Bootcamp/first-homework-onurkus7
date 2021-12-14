package entityservice;

import dao.KategoryDao;
import entity.Kategory;

import java.util.List;

public class KategoryEntityService {

    private KategoryDao kategoryDao;

    public KategoryEntityService() {
        kategoryDao = new KategoryDao();
    }

    public List<Kategory> findAll(){
        return kategoryDao.findAll();
    }
}
