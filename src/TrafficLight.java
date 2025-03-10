public class TrafficLight {
    private String color;

    public TrafficLight(String color) {
        this.color = color;
    }

    public void changeColor(String newColor) {
        this.color = newColor;
        System.out.println("Traffic light changed to: " + color);
    }

    public String getColor() {
        return this.color;
    }
}
