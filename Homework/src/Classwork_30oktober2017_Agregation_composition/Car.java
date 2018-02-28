package Classwork_30oktober2017_Agregation_composition;

public class Car {
    private String manufactorer;
    private String model;
    private Engine engine;

    public Car(String manufactorer, String model, int hp, int vol) {
        this.manufactorer = manufactorer;
        this.model = model;
        this.engine = new Engine(hp, vol);

    }public Car(String manufactorer, String model, Engine engine) {
        this.manufactorer = manufactorer;
        this.model = model;
        this.engine = engine;
    }

    public String getManufactorer() {
        return manufactorer;
    }

    public void setManufactorer(String manufactorer) {
        this.manufactorer = manufactorer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

//    public Engine getEngine() {
//        return engine;
//    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufactorer='" + manufactorer + '\'' +
                ", model='" + model + '\'' +
                ", engine=" + engine +
                '}';
    }
    public void startCar(){
//        engine.startEngine();
    }
}
