public class Car {
    private String make;
    private String model;
    private int speed;

    public Car(String make, String model, int speed) {
        this.make = make;
        this.model = model;
        this.speed = speed;
    }

    public void accelerate(int increment) {
        this.speed += increment;
        System.out.println(this.make + " " + this.model + " accelerates to " + this.speed + " mph.");
    }

    public void brake(int decrement) {
        this.speed -= decrement;
        System.out.println(this.make + " " + this.model + " slows down to " + this.speed + " mph.");
    }

    public String getCarInfo() {
        return this.make + " " + this.model + " moving at " + this.speed + " mph.";
    }
}
