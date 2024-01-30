
package com.veroneze.program;

import entities.Product;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EstoqueEPIs {

    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("VERONEZE_EPI_DB");
        EntityManager manager = emf.createEntityManager();
        
        Product p = new Product(null, "teste", "P", 10, "Teste");
        manager.getTransaction().begin();
        manager.persist(p);
        manager.getTransaction().commit();
    }
}
