package singleresponsability;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SalesBuilder {

    private List<Sales> salesOfProduct;

    public SalesBuilder(){
        salesOfProduct = new ArrayList<Sales>();
    }

    public Sales registerSale(int quantity, Product product){
        Sales sales  = new Sales(new Date(), quantity, product);
        salesOfProduct.add(sales);
        return sales;
    }

    public void removeSale(Sales sales){
        salesOfProduct.remove(sales);
    }

    public List<Sales> getSalesOfProduct() {
        return salesOfProduct;
    }

    public void setSalesOfProduct(List<Sales> salesOfProduct) {
        this.salesOfProduct = salesOfProduct;
    }
}
