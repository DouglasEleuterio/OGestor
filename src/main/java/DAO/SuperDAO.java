package DAO;

import Util.DBException;
import java.io.Closeable;
import java.io.IOException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SuperDAO implements Closeable {

    protected EntityManager em;

    public EntityManager getConetion() throws DBException {
        if (em == null) {
            try {
                EntityManagerFactory factory
                        = Persistence.createEntityManagerFactory("OGestorPU");
                em = factory.createEntityManager();
            } catch (Exception ex) {
                throw new DBException("Falha ao conectar com o banco de dados", ex);
            }
        }
        return em;
    }

    public SuperDAO() {

        if (em == null) {
            try {   
                EntityManagerFactory factory
                        = Persistence.createEntityManagerFactory("OGestorPU");
                em = factory.createEntityManager();
            } catch (Exception ex)  {
                System.out.println("Exception no construtor do SuperDAO"); 
            }
        }

    }
    @Override
    public void close() throws IOException {
        System.out.println("Desconectando do banco");
        if (em != null) {
            try {
                em.close();
            } catch (Exception ex) {
                System.out.println("Este catch jamais sera executado");
            }finally{
                em.close();
            }
        }
    }
}
