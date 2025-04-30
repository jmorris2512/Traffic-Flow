public class TrafficLight {
    private TrafficLightColor color;
    private int greenDuration; // Time duration for the green light (in cycles)
    private int yellowDuration; // Time duration for the yellow light (in cycles)
    private int redDuration; // Time duration for the red light (in cycles)
    private int cycleCount;

    public TrafficLight(TrafficLightColor color, int greenDuration, int yellowDuration, int redDuration) {
        this.color = color;
        this.greenDuration = greenDuration;
        this.yellowDuration = yellowDuration;
        this.redDuration = redDuration;
        this.cycleCount = 0;  // To keep track of cycles
    }

    public void changeColor(TrafficLightColor newColor) {
        this.color = newColor;
        System.out.println("Traffic light changed to: " + color);
    }

    public TrafficLightColor getColor() {
        return this.color;
    }

    // Simulate the traffic light cycling with adaptive durations based on traffic density
    public void cycle() {
        if (this.color == TrafficLightColor.RED) {
            if (cycleCount % redDuration == 0) {
                changeColor(TrafficLightColor.GREEN);
            }
        } else if (this.color == TrafficLightColor.GREEN) {
            if (cycleCount % greenDuration == 0) {
                changeColor(TrafficLightColor.YELLOW);
            }
        } else if (this.color == TrafficLightColor.YELLOW) {
            if (cycleCount % yellowDuration == 0) {
                changeColor(TrafficLightColor.RED);
            }
        }
        cycleCount++;
    }

    // Adjust the light duration based on traffic conditions (e.g., queue length)
    public void adjustSignalDuration(int trafficDensity) {
        if (trafficDensity > 10) {
            this.greenDuration = 5; // Extend green light if traffic is high
        } else {
            this.greenDuration = 3; // Shorter green light if traffic is low
        }
    }
}
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
