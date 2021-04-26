package Connection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class ConnectionFactory {
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
    
    public static EntityManager getConnection(){
        return emf.createEntityManager();
    }
}
