
package com.veroneze.program;

import entities.Product;
import entities.ProductDAO;

public class EstoqueEPIs {

    public static void main(String[] args) {
        ProductDAO productDAO = new ProductDAO();
        Product prod = new Product(null, "Bota PVC", "36", 10, "Bico de aço");
        
        productDAO.Create(prod);
    }
}
