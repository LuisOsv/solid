package singleresponsability;

import java.util.ArrayList;
import java.util.List;

public class ProductManager {

    List<Product> productList;

    public ProductManager(){
        productList = new ArrayList<Product>();
    }

    public void addProduct(Product product){
        productList.add(product);
    }

    public boolean removeProduct(String productName){
        for (Product product: productList){
            if(product.getName() == productName){
                return productList.remove(product);
            }
        }
        return false;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
