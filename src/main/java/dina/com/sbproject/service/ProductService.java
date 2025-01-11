package dina.com.sbproject.service;

import dina.com.sbproject.model.Product;
import java.util.List;

public interface ProductService {
    void saveProduct(Product product);
    List<Product> getAllProducts();
    Product getProductById(Long id); // Fetch product by ID
    boolean deleteProductById(Long id); // Delete product by ID
}
