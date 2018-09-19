package liskovsubstitution;

public class PaperBook extends Book{

    private String shippingWeight;
    private Integer inStock;

    public PaperBook(String title, String author, double price, String shippingWeight, Integer inStock) {
        super(title, author, price);
        this.shippingWeight = shippingWeight;
        this.inStock = inStock;
    }

    public String getShippingWeight() {
        return shippingWeight;
    }

    public void setShippingWeight(String shippingWeight) {
        this.shippingWeight = shippingWeight;
    }

    public Integer getInStock() {
        return inStock;
    }

    public void setInStock(Integer inStock) {
        this.inStock = inStock;
    }
}
