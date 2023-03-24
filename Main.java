public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Hilux", 1998, 16030, "Black", 3);
        System.out.println(car.toString());
        car.sell(1);
        System.out.println("InStock " + car.getQuantity());
        car.setColor("Black");
        System.out.println(car.toString());
    }
}
