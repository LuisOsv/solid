package singleresponsability;

import java.util.ArrayList;
import java.util.List;

public class ProductBuilder {

    List<Product> products;

    public ProductBuilder(){
        products = new ArrayList<Product>();
    }

    public void addProduct(Product product){
        products.add(product);
    }

    public boolean removeProduct(String productName){
        for (Product product: products){
            if(product.getName().equals(productName)){
                return products.remove(product);
            }
        }
        return false;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
