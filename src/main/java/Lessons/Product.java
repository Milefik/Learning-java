package Lessons;

public class Product {
    private String name;
    private String productionDate;
    private String manufacturer;
    private String countryOrigin;
    private int price;
    private boolean buyerBookingStatus;
    public Product(String name, String productionDate, String manufacturer, String countryOrigin, int price, boolean buyerBookingStatus) {
        this.name = name;
        this.productionDate = productionDate;
        this.manufacturer = manufacturer;
        this.countryOrigin = countryOrigin;
        this.price = price;
        this.buyerBookingStatus = buyerBookingStatus;
    }
    public void printProduct() {
        System.out.println("Name: " + name + System.lineSeparator() + "Production date: " + productionDate + System.lineSeparator() + "Manufacturer: " + manufacturer + System.lineSeparator() + "Country origin: " + countryOrigin + System.lineSeparator() + "Price: " + price + System.lineSeparator() + "Buyer booking status: " + buyerBookingStatus);
    }
}