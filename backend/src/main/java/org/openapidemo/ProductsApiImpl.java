package org.openapidemo;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import org.openapidemo.api.ProductsApi;
import org.openapidemo.model.Product;

public class ProductsApiImpl implements ProductsApi {

    @Override
    public void addProduct(@Valid Product product) {
        // TODO Auto-generated method stub

    }

    @Override
    public Product deleteProduct(UUID productId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Product getProduct(UUID productId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Product> searchProducts(String searchString) {
        var products = new ArrayList<Product>();
        Product product = new Product();
        product.setName("Back-end product");
        product.setDescription("Back-end product description");
        product.setId(UUID.randomUUID());
        products.add(product);
        
        return products;
    }

    @Override
    public void updateProduct(UUID productId, @Valid Product product) {
        // TODO Auto-generated method stub

    }

}
