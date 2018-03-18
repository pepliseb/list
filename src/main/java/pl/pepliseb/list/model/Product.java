package pl.pepliseb.list.model;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private String name;
    private String desciption;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesciption() {
        return desciption;
    }

    public void setDesciption(String desciption) {
        this.desciption = desciption;
    }

    public Product(String name, String desciption) {
        this.name = name;
        this.desciption = desciption;
    }

    public static List<Product> generateExampleProduct(){
        List<Product> products = new ArrayList<>();
        products.add(new Product("pralka","super pralka"));
        products.add(new Product("telefon","samsung galaxy"));
        products.add(new Product("zabawka","zabawkowe klocki"));
        products.add(new Product("tablet","samsung tab 10"));
        return products;

    }

}
