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
        // Basic traffic light and car actions
        for (TrafficLight light : trafficLights) {
            System.out.println("Current light color: " + light.getColor());
            light.changeColor("Green"); // Change light to green for simplicity
        }

        for (Car car : cars) {
            car.accelerate(10); // Simulate cars accelerating
            car.brake(5); // Simulate cars braking
        }

        System.out.println("Simulation has completed.");
    }
}

