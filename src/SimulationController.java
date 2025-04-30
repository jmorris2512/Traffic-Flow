import java.util.ArrayList;
import java.util.List;

public class SimulationController {
    private List<TrafficLight> trafficLights;
    private List<Car> cars;
    private int trafficDensity;  // Represents the number of cars on the road
    private boolean incidentOccurred;

    public SimulationController(int trafficDensity) {
        this.trafficLights = new ArrayList<>();
        this.cars = new ArrayList<>();
        this.trafficDensity = trafficDensity;
        this.incidentOccurred = false;  // No incident by default
    }

    public void addTrafficLight(TrafficLight light) {
        trafficLights.add(light);
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public void simulateIncident() {
        // Randomly simulate incidents (e.g., stalled car or accident)
        if (Math.random() < 0.1) { // 10% chance of incident
            this.incidentOccurred = true;
            System.out.println("An incident occurred: Lane blocked by a stalled car!");
        }
    }

    public void runSimulation(int cycleCount) {
        for (int i = 0; i < cycleCount; i++) {
            System.out.println("\nCycle " + (i + 1) + " starts:");

            // Simulate incident (10% chance)
            simulateIncident();

            // Adjust traffic light based on traffic density
            for (TrafficLight light : trafficLights) {
                light.adjustSignalDuration(trafficDensity);
                light.cycle(); // Cycle traffic light (change colors)
            }

            // Cars react based on traffic light status and incidents
            for (Car car : cars) {
                if (incidentOccurred) {
                    // Reduce car speed if there's an incident
                    car.brake(5);  // Cars slow down due to the incident
                } else {
                    // Normal car behavior based on light status
                    if (trafficLights.get(0).getColor() == TrafficLightColor.GREEN) {
                        car.accelerate(10);  // Accelerate on green
                    } else {
                        car.brake(5);  // Brake on red/yellow
                    }
                }
            }
        }

        System.out.println("Simulation has completed.");
    }
}
