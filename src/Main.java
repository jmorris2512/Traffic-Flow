public class Main {
    public static void main(String[] args) {
        // Initialize Traffic Lights with Enum
        TrafficLight light1 = new TrafficLight(TrafficLightColor.RED);
        TrafficLight light2 = new TrafficLight(TrafficLightColor.GREEN);

        // Initialize Cars
        Car car1 = new Car("Toyota", "Corolla", 30);
        Car car2 = new Car("Honda", "Civic", 40);

        // Initialize Simulation Controller
        SimulationController controller = new SimulationController();
        controller.addTrafficLight(light1);
        controller.addTrafficLight(light2);
        controller.addCar(car1);
        controller.addCar(car2);

        // Start Simulation
        controller.runSimulation();
    }
}
