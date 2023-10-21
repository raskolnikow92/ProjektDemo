package com.example.location;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Repository
//
//Noch keine Funktionalität
//
public class RoomRepository {
    private final List<Room> roomList = new ArrayList<>();

    public List<Room> findAll(){
        return roomList;
    }
    public void save(Room room){
        for(int i = 0; i <roomList.size(); i++){
            if(roomList.get(i).getId()==room.getId()){
                roomList.set(i, room);
                return;
            }
        }
        roomList.add(room);
    }

}
