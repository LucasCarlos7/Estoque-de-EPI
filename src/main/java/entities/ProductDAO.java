package entities;

import jakarta.persistence.EntityManager;

public class ProductDAO {

    public void Create(Product p) {
        EntityManager entityManager = JPAPersistenceUseful.getEntityManager();
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(p);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            throw e;
        } finally {
            JPAPersistenceUseful.closeEntityManager();
        }
    }
}
