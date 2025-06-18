package com.pluralsight.northwindtraders.console;

import com.pluralsight.northwindtraders.console.dao.ProductDao;
import com.pluralsight.northwindtraders.console.model.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SimpleProductDao implements ProductDao {
    List<Product> products = new ArrayList<>();

    public SimpleProductDao() {
        products.add(new Product(1,"Coffee","Beverage",6.00));
        products.add(new Product(2,"Green Tea","Beverage",3.00));
        products.add(new Product(3,"Smoothie","Beverage",7.00));
    }

    @Override
    public List<Product> getAll() {
        return List.of();
    }

    @Override
    public Product add(Product product) {
        for(Product p : produ)

        if(product.getProductId() == 0)

        products.add(product);
        return product;
    }
}
