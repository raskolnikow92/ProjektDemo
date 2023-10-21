package com.example.location;

import com.example.utility.Device;

import java.util.ArrayList;
import java.util.List;

public class Room {
    public final int id;
    public final List<Device> deviceList;

    public Room(int id, List<Device> deviceList) {
        this.id = id;
        this.deviceList = deviceList;
    }
    public Room(int id){
        this.id = id;
        this.deviceList = new ArrayList<>();
    }
    public Room(int id, Device device){
        this.id = id;
        this.deviceList = new ArrayList<>();
        deviceList.add(device);
    }
    public int getId(){
        return id;
    }
}
