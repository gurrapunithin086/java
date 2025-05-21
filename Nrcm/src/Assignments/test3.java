package Assignments;

interface Gadget {
    void brand();
}

class Device {
    public void feature() {
        System.out.println("Top Feature: Face Recognition");
    }
}

class Smartphone extends Device implements Gadget {
    public void model() {
        System.out.println("Model: Galaxy S23 Ultra");
    }

    public void brand() {
        System.out.println("Brand: Samsung");
    }
}

class Laptop extends Smartphone {
    public void specs() {
        System.out.println("Specs: 16GB RAM, i7 Processor");
    }
}

public class test3 {
    public static void main(String[] args) {
        Smartphone phone = new Smartphone();
        Laptop lap = new Laptop();

        phone.brand();
        lap.specs();
        phone.model();
        phone.feature();
    }
}


