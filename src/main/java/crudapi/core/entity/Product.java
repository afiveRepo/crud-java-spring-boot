package crudapi.core.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "product_tbl")
public class Product {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int quality;
    private double price;
    public Product(String name, int quality, double price){
        this.name = name;
        this.quality = quality;
        this.price = price;
    }
    public int getId() {
        return id;
    }
    public double getPrice() {
        return price;
    }
    public int getQuality() {
        return quality;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setQuality(int quality) {
        this.quality = quality;
    }
}

