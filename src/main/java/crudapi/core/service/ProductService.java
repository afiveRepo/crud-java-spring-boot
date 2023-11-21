package crudapi.core.service;

import crudapi.core.entity.Product;
import crudapi.core.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    public Product saveProduct(Product product){
        return repository.save(product);
    }
    public List<Product> saveProducts(List<Product> product){
        return repository.saveAll(product);
    }
    public List<Product> getProducts(){
        return repository.findAll();
    }
    public Product getProductById(int id){
        return repository.findById(id).orElse(null);
    }
    public Product getProductByName(String name){
        return repository.findByName(name);
    }
    public String deleteProduct(int id){
        repository.deleteById(id);
        return "Delete Success "+ id;
    }
    public Product updateProduct(Product product){
        Product selectProduct=repository.findById(product.getId()).orElse(null);
        selectProduct.setName(product.getName());
        selectProduct.setPrice(product.getPrice());
        selectProduct.setQuality(product.getQuality());
        return repository.save(selectProduct);
    }

}
