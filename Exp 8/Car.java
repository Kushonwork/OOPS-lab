class Car {
    class Engine {
        public void start() {
            System.out.println("Engine started");
        }

        public void stop() {
            System.out.println("Engine stopped");
        }
    }

    public void drive() {
        Engine engine = new Engine();
        engine.start();
        engine.stop();
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.drive();
    }
}