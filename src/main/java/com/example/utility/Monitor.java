package com.example.utility;

public class Monitor implements Device{
    private final String name;
    private final int id;

    public Monitor(String name, int id) {
        this.name = name;
        this.id = id;
    }
    @Override
    public String getName(){
        return name;
    }

    @Override
    public int getId() {
        return id;
    }

}
