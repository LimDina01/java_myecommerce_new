package dina.com.sbproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import dina.com.sbproject.model.Product;
import dina.com.sbproject.repository.ProductRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void saveProduct(Product product) {
        if (product.getId() != null && productRepository.existsById(product.getId())) {
            // Ensure the product is managed and updated
            Product existingProduct = productRepository.findById(product.getId()).orElse(null);
            if (existingProduct != null) {
                product.setCreatedAt(existingProduct.getCreatedAt()); // Preserve created_at
            }
        } else {
            product.setCreatedAt(LocalDateTime.now());
        }
        product.setUpdatedAt(LocalDateTime.now()); // Update timestamp
        productRepository.saveAndFlush(product); // Persist changes
    }




    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();  // Retrieve all products from the database
    }

    @Override
    public Product getProductById(Long id) {
        return productRepository.findById(id).orElse(null);  // Fetch product by ID, or return null if not found
    }

    @Override
    public boolean deleteProductById(Long id) {
        Optional<Product> product = productRepository.findById(id); // Check if the product exists
        if (product.isPresent()) {
            productRepository.delete(product.get()); // Delete the product if it exists
            return true; // Return true if the product was deleted
        }
        return false; // Return false if the product was not found
    }


}
