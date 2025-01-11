//package dina.com.sbproject.controller;
//
//import dina.com.sbproject.model.Category;
//import dina.com.sbproject.model.Product;
//import dina.com.sbproject.service.CategoryService;
//import dina.com.sbproject.service.ProductService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import java.math.BigDecimal;
//import java.util.List;
//
//@Controller
//public class CategoryController {
//
//    @Autowired
//    private ProductService productService; // Ensure this service is correctly implemented
//
//    @Autowired
//    private CategoryService categoryService; // Inject the CategoryService
//
//    @RequestMapping("/add_product")
//    public String showAddProductForm(Model model) {
//        List<Category> categories = categoryService.findAllCategories(); // Now this should work
//        model.addAttribute("categories", categories); // Add categories to the model
//        return "admin/add_product"; // Return the Thymeleaf template name
//    }
//
//    @PostMapping("/add_product") // Ensure this matches the form action
//    public String addProduct(
//            @RequestParam String name,
//            @RequestParam String description,
//            @RequestParam BigDecimal price,
//            @RequestParam Long categoryId, // This will still be used
//            @RequestParam String imageUrl) {
//
//        Product product = new Product();
//        product.setName(name);
//        product.setDescription(description);
//        product.setPrice(price);
//        product.setCategoryId(categoryId); // Use the category ID from the dropdown
//        product.setImageUrl(imageUrl);
//        productService.saveProduct(product); // Save the product using your service
//
//        return "admin/add_product"; // Redirect to a list page or wherever you want
//    }
//}
