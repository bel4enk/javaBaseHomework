package Product;

public class Tv extends Product {
    String brand;
    String model;
    String category;
    double price;
    int identifier;

    public Tv(int identifier) {
        this.identifier = identifier;
    }

    public Tv(String brand, int identifier) {
        this.brand = brand;
        this.identifier = identifier;
    }

    public Tv(String brand, String category, int identifier) {
        this.brand = brand;
        this.category = category;
        this.identifier = identifier;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getIdentifier() {
        return identifier;
    }

    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }
}
