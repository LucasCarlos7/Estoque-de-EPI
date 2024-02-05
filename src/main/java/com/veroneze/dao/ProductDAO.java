package com.veroneze.dao;

import com.veroneze.entities.Product;
import com.veroneze.jpa.JPAPersistenceUseful;
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
