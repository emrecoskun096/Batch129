package adeneme;
public class Car {
    int price = 50;


    public Car(int price) {
        this.price = price;
    }
    public static void main(String[] args) {

        Car c1 = new Car(50);
        System.out.println(c1);
    }
}