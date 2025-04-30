import java.util.ArrayList;
import java.util.List;

public class SimulationController {
    private List<TrafficLight> trafficLights;
    private List<Car> cars;

    public SimulationController() {
        this.trafficLights = new ArrayList<>();
        this.cars = new ArrayList<>();
    }

    public void addTrafficLight(TrafficLight light) {
        trafficLights.add(light);
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public void runSimulation() {
        // Simulate a simple loop with traffic lights changing and cars reacting
        int cycleCount = 5; // Number of cycles to simulate

        for (int i = 0; i < cycleCount; i++) {
            System.out.println("\nCycle " + (i + 1) + " starts:");

            // Change traffic light state
            for (TrafficLight light : trafficLights) {
                System.out.println("Current light color: " + light.getColor());
                light.cycle(); // Cycle the light
            }

            // Cars respond to traffic lights
            for (Car car : cars) {
                if (trafficLights.get(0).getColor() == TrafficLightColor.GREEN) {
                    car.accelerate(10); // Cars accelerate on green light
                } else {
                    car.brake(5); // Cars brake on red/yellow light
                }
            }
        }

        System.out.println("Simulation has completed.");
    }
}

