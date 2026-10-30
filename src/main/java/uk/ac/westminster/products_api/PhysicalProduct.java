package uk.ac.westminster.products_api;

public class PhysicalProduct extends Product {

    // A PhysicalProduct IS-A Product because it represents a product that can be physically shipped to a customer.
    // A ShoppingCart is NOT a Product because it contains products rather than being a product itself (HAS-A relationship).

    private double weightKg;
    private String dimentions;

    public PhysicalProduct() {
    }

    public PhysicalProduct(Long id, String name, double price, double weightKg, String dimentions) {
        super(id, name, price);
        this.weightKg = weightKg;
        this.dimentions = dimentions;
    }

    public double getWeightKg() {
        return weightKg;
    }

    public String getDimentions() {
        return dimentions;
    }
}
