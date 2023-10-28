package FactoryDesignPattern;

public class CarFactory {

    //Function where objects of all subclasses are instantiated
    public void buildCar(CarType model){
        Car c;

        switch (model){
            case Sedan:
                c = new Sedan(model);
                break;
            case Hatchback:
                c = new Hatchback(model);
                break;
            case SUV:
                c = new SUV(model);
                break;
        }
    }
}
