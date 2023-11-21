package crudapi.core.controller;

import crudapi.core.entity.Product;
import crudapi.core.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService service;

    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product){
        return service.saveProduct(product);
    }
    @PostMapping("/addProducts")
    public List<Product> addProducts(@RequestBody List<Product> product){
        return service.saveProducts(product);
    }
    @GetMapping("/product")
    public List<Product> getAllProduct(){
        return service.getProducts();
    }
    @GetMapping("/product/{id}")
    public Product getAllProduct(@PathVariable int id){
        return service.getProductById(id);
    }
    @GetMapping("/productName/{name}")
    public Product getAllProduct(@PathVariable String name){
        return service.getProductByName(name);
    }
    @PutMapping("/update")
    public Product updateProduct(@RequestBody Product product){
        return service.updateProduct(product);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id){
        return service.deleteProduct(id);
    }

}
