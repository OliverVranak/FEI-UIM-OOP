package sk.stuba.fei.uim.oop.car;

import sk.stuba.fei.uim.oop.car.Auto;

public class Main {
    public static void main(String[] args) {
        Auto skoda = new Auto();
        skoda.getStatus(100);
        skoda.drive(50);
    }
}
