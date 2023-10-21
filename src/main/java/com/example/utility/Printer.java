package com.example.utility;

public class Printer implements Device{
    private final String name;
    private final int id;

    public Printer(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getId() {
        return id;
    }
}
