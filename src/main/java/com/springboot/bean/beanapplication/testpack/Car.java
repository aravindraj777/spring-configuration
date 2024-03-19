package com.springboot.bean.beanapplication.testpack;

public class Car {

    Engine engine;

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getEngineData(){
        return engine.name;
    }
}
