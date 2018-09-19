package singleresponsability;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SalesManager {

    private List<Sales> salesList;

    public SalesManager(){
        salesList = new ArrayList<Sales>();
    }

    public Sales registerSale(int quantity, Product product){
        Sales sales  = new Sales(new Date(), quantity, product);
        salesList.add(sales);
        return sales;
    }

    public void removeSale(Sales sales){
        salesList.remove(sales);
    }

    public List<Sales> getSalesList() {
        return salesList;
    }

    public void setSalesList(List<Sales> salesList) {
        this.salesList = salesList;
    }
}
