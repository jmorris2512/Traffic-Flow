# Traffic Flow Simulation

## Overview
This project models and simulates **traffic flow optimization using discrete-event simulation**. The goal is to analyze and compare the performance of **fixed-cycle traffic signals** and **adaptive signal control systems** to reduce congestion and improve efficiency.

## Goals
- Simulate **fixed and adaptive** traffic signals under varying traffic conditions.
- Model the effect of **vehicle arrivals, queue formations, and light changes**.
- Integrate **incident handling** to study how breakdowns or accidents affect traffic flow.
- Utilize **SimJava** for implementing the discrete-event simulation.

## Features
- **Traffic Signal Control**: Models both fixed-cycle and adaptive signals.
- **Vehicle Queuing System**: Tracks vehicle arrival rates and queue lengths.
- **Incident Simulation**: Simulates traffic disruptions and system responses.
- **Performance Metrics**: Measures average wait times and traffic throughput.

## Repository Structure
```
/TrafficFlowSimulation
│── /src                  # Source code (SimJava implementation)
│── /docs                 # Documentation (literature review, UML diagrams, test plans)
│── /tests                # Test cases for validation
│── README.md             # Project overview and instructions
│── LICENSE               # MIT License
│── .gitignore            # Java-specific ignored files
```

## Getting Started
### Prerequisites
- **Java Development Kit (JDK 11+)**
- **SimJava Library** (Discrete-event simulation package)
- **Git** (for source control)

### Installation
1. Clone the repository:
   ```sh
   git clone https://github.com/jmorris2512/Traffic-Flow.git
   ```
2. Navigate to the project directory:
   ```sh
   cd Traffic-Flow
   ```
3. Compile the simulation code:
   ```sh
   javac -cp src:. src/Main.java
   ```
4. Run the simulation:
   ```sh
   java -cp src:. Main
   ```

## Documentation
- **Literature Review**: Overview of previous research on traffic optimization.
- **UML Diagrams**: Structural and behavioral design of the simulation.
- **Test Plans**: Cases designed to validate system functionality.

## Future Enhancements
- Integrate **real-world traffic data** for improved accuracy.
- Optimize adaptive signals using **machine learning models**.
- Enhance visualization with **graphical simulation outputs**.

## Contributors
- **Justin Morris** - Lead Developer & Researcher

## License
This project is licensed under the MIT License - see the LICENSE file for details.

