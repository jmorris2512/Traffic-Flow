public enum TrafficLightColor {
    RED, GREEN, YELLOW;
}

public class TrafficLight {
    private TrafficLightColor color;

    public TrafficLight(TrafficLightColor color) {
        this.color = color;
    }

    public void changeColor(TrafficLightColor newColor) {
        this.color = newColor;
        System.out.println("Traffic light changed to: " + color);
    }

    public TrafficLightColor getColor() {
        return this.color;
    }

    // Simulate the traffic light cycling
    public void cycle() {
        switch (color) {
            case RED:
                changeColor(TrafficLightColor.GREEN);
                break;
            case GREEN:
                changeColor(TrafficLightColor.YELLOW);
                break;
            case YELLOW:
                changeColor(TrafficLightColor.RED);
                break;
        }
    }
}
