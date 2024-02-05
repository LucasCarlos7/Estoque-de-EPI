package com.veroneze.dao;

import com.veroneze.entities.Operation;
import com.veroneze.jpa.JPAPersistenceUseful;
import jakarta.persistence.EntityManager;

public class OperationDAO {

    public void create(Operation o) {
        EntityManager entityManager = JPAPersistenceUseful.getEntityManager();
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(o);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            throw e;
        } finally {
            JPAPersistenceUseful.closeEntityManager();
        }
    }
}
