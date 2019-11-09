package com.example.demo.cars;

import com.example.demo.IEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {

    @Autowired
    @Qualifier("EngineFast")
    IEngine engine;

    @Autowired
    Suspension suspension;

    public Car() {
    }

    public Car(IEngine engine, Suspension suspension) {
        this.engine = engine;
        this.suspension = suspension;
    }

    public IEngine getEngine() {
        return engine;
    }

    public Suspension getSuspension() {
        return suspension;
    }

    public void setSuspension(Suspension suspension) {
        this.suspension = suspension;
    }

    public void setEngine(IEngine engine) {
        this.engine = engine;
    }

    public int drive() {

        if (engine.work() == 2 && suspension.work() == 1) {
            System.out.println("---- Driving Car Fast ----");
            return 1;
        } else if (engine.work() == 1 && suspension.work() == 1) {
            System.out.println("---- Driving Car Slow ----");
            return 2;
        } else if (engine.work() == 0 && suspension.work() == 1) {
            System.out.println("---- No Driving of Car ----");
            return 3;
        } else if (engine.work() == 0 && suspension.work() == 0) {
            System.out.println("---- Car should be repaired ----");
            return 4;
        } else {
            System.out.println("---- Crash----");
            return 5;
        }

    }

}






