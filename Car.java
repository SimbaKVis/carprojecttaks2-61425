public class Car {
    private String brand;
    private String model;
    private int year;
    private double price;
    private String color;
    private int quantity;

    public Car(String brand, String model, int year, double price, String color, int quantity) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
        this.quantity = quantity;
    }

    public String getModel() {
        return model;}

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void delivery(int carDostaw) {
        this.quantity += carDostaw;
    }

    public void sell(int carDostaw) {
        if (this.quantity >= carDostaw) {
            this.quantity -= carDostaw;
            System.out.println( carDostaw  + " " + this.brand + " " + this.model "have been sold");
        } else {
            System.out.println("No more vehicles of " + this.brand + this.model" remaining");
        }
    }

    public String toString() {
        return "Car{" +
                " of model='" + model + '\'' + ", and brand='" + brand + '\'' +  ", color='" + color + '\'' +  ",and year=" + year +  ",and value=" + price  +  ", quantity=" + quantity +}';
    }
}

