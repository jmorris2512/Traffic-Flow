public class Main {
    public static void main(String[] args) {
        // Initialize Traffic Lights with Enum and customized durations
        TrafficLight light1 = new TrafficLight(TrafficLightColor.RED, 3, 1, 5);  // Red for 5 cycles
        TrafficLight light2 = new TrafficLight(TrafficLightColor.GREEN, 3, 1, 5);  // Green for 3 cycles
        TrafficLight light3 = new TrafficLight(TrafficLightColor.RED, 3, 1, 5);

        // Initialize Cars
        Car car1 = new Car("Toyota", "Corolla", 30);
        Car car2 = new Car("Honda", "Civic", 40);
        Car car3 = new Car("BMW", "X5", 50);

        // Initialize Simulation Controller with a traffic density of 15 cars
        SimulationController controller = new SimulationController(15);  // High density
        controller.addTrafficLight(light1);
        controller.addTrafficLight(light2);
        controller.addTrafficLight(light3);
        controller.addCar(car1);
        controller.addCar(car2);
        controller.addCar(car3);

        // Start Simulation with 10 cycles
        controller.runSimulation(10);
    }
}
