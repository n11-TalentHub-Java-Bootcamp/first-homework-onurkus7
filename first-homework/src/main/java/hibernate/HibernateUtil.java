package hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {

        try {
            Configuration cfg = new Configuration();

//            cfg.addAnnotatedClass(Kategory.class);

            SessionFactory sessionFactory = cfg.configure("hibernate.cfg.xml").buildSessionFactory();

            return sessionFactory;

        } catch (Exception e){
            System.out.println("An error occurred while creating Session Factory." + e);
            throw new ExceptionInInitializerError(e);
        }

    }

    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }

}
