package singleresponsability;

import java.util.Date;

public class Sales {

    private Date salesDate;
    private Integer quantity;
    private Product product;

    public Sales(Date salesDate, Integer quantity, Product product) {
        this.salesDate = salesDate;
        this.quantity = quantity;
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Date getSalesDate() {
        return salesDate;
    }

    public void setSalesDate(Date salesDate) {
        this.salesDate = salesDate;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
