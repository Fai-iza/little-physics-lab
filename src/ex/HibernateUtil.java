
package ex;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;


public class HibernateUtil {

    private static final SessionFactory sessionFactory;
    private static final SessionFactory sessionFactory2;
    
    static {
        try {
             // loads configuration and mappings
            Configuration configuration = new Configuration().configure("/ex/hibernate.cfg.xml");
            ServiceRegistry serviceRegistry= new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
            configuration.addAnnotatedClass(sign_up_in.class);
            // builds a session factory from the service registry
            sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        } catch (Throwable ex) {
            // Log the exception. 
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    static {
        try {
             // loads configuration and mappings
             
            Configuration configuration2 = new Configuration().configure("/ex/hibernate.cfg.xml");
            ServiceRegistry serviceRegistry2= new StandardServiceRegistryBuilder().applySettings(configuration2.getProperties()).build();
            configuration2.addAnnotatedClass(score.class);
            // builds a session factory from the service registry
            sessionFactory2 = configuration2.buildSessionFactory(serviceRegistry2);
        } catch (Throwable ex) {
            // Log the exception. 
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    
    public static SessionFactory getSessionFactory_2() {
        return sessionFactory2;
    }
}

