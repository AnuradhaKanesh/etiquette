import java.util.List;

public class Car {

    private Engine engine;
    private List<Wheel> wheelList;

    public Car()
    {
        engine= new Engine();
    }

    public void start() {
        System.out.println("Starting Car");
        engine.start();
    }

    public void stop() {
        System.out.println("Stopping Car");
        engine.stop();
    }

}
