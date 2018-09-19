package singleresponsability;

public class Product {

    private String name;
    private double price;
    private int unitsInStock;

    public Product(String name, double price, int unitsInStock) {
        this.name = name;
        this.price = price;
        this.unitsInStock = unitsInStock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getUnitsInStock() {
        return unitsInStock;
    }

    public void setUnitsInStock(int unitsInStock) {
        this.unitsInStock = unitsInStock;
    }

}
