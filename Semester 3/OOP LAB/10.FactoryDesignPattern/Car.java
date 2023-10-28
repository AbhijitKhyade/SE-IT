package FactoryDesignPattern;
//Abstract class
public abstract class Car {
    //CarType Attribute
    private CarType model;

    //Parameterized constructor
    Car(CarType model){
        this.model = model;
    }

    //Methods
    abstract void constructCar();
    abstract void colour();
    abstract void brand();
}
