package liskovsubstitution;

public class EBook extends  Book{

    private String downloadUrl;
    private String sizeMB;

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public String getSizeMB() {
        return sizeMB;
    }

    public void setSizeMB(String sizeMB) {
        this.sizeMB = sizeMB;
    }

    public EBook(String title, String author, double price) {
        super(title, author, price);
    }

}
