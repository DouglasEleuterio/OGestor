package Util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class BasicService {

    protected static EntityManagerFactory entityManagerFactory;
    protected static EntityManager entityManager;
    protected static EntityTransaction transaction;

    static {
        entityManagerFactory = Persistence.createEntityManagerFactory("OGestorPU");
        entityManager = entityManagerFactory.createEntityManager();
        transaction = entityManager.getTransaction();
    }
}
