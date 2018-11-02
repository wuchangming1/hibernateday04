package utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by Administrator on 2018/11/2.
 */
public class H3Utils {
    public static SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

    public static Session openSession(){
        return sessionFactory.openSession();
    }

    public static Session getCurrentSession(){
        return sessionFactory.getCurrentSession();
    }
}
