package vn.myclass.core.common.utils;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory(){
        try {
            return new Configuration().configure().buildSessionFactory();
        }catch (Throwable e){
            System.out.println("Initial sessionFactory failed ");
            throw new ExceptionInInitializerError(e);
        }

    }

    public  static SessionFactory getSessionFactory(){
        return sessionFactory;
    }


}
