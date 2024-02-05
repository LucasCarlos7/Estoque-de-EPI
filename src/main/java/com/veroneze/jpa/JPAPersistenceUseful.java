package com.veroneze.jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JPAPersistenceUseful {

    /* constante para centraizar o nome da unidade de persistência
       se o nome mudar, precisaremos alterar em um só lugar */
    private static final String PERSISTENCE_UNIT = "VERONEZE_EPI_DB";

    private static EntityManager entityManager;
    private static EntityManagerFactory entityManagerFactory;

    // cria a entidade se estiver nula e retorna
    public static EntityManager getEntityManager() {
        if (entityManagerFactory == null || !entityManagerFactory.isOpen()) {
            entityManagerFactory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
        }

        //cria se em nulo ou se o entity manager foi fechado
        if (entityManager == null || !entityManager.isOpen()) {
            entityManager = entityManagerFactory.createEntityManager();
        }

        return entityManager;
    }

    //fecha o EntityManager e o EntityManagerFactory
    public static void closeEntityManager() {
        if (entityManager.isOpen() && entityManager != null) {
            entityManager.close();
            entityManagerFactory.close();
        }
    }
}
