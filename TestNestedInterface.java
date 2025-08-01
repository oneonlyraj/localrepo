import java.util.*;

interface Vehicle {
    void start();

    // Nested interface
    interface Engine {
        void startEngine();
    }
}

// Class implementing the outer interface
class Car implements Vehicle {
    public void start() {
        System.out.println("Car is starting");
    }

    // Class implementing the nested interface
    class DieselEngine implements Vehicle.Engine {
        public void startEngine() {
            System.out.println("Diesel Engine starting");
        }

        public void engineType() {
            System.out.println("Diesel Engine");
        }
    }
}

public class TestNestedInterface {
    public static void main(String args[]) {
        Car car = new Car();
        car.start();

        Car.DieselEngine engine = car.new DieselEngine();
        engine.startEngine();
        engine.engineType();
    }
}
