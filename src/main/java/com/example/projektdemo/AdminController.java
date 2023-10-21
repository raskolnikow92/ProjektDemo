package com.example.projektdemo;

import com.example.location.Room;
import com.example.location.RoomRepository;
import com.example.utility.Device;
import com.example.utility.Monitor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AdminController {
    private List<Room> roomList = new ArrayList<>();


    @GetMapping("/rooms")
    public String createRooms(){
        return "einrichten";
    }
    @PostMapping("/rooms")
    public String doRoom(String roomId, String device){
        int intRoomId = Integer.parseInt(roomId);
        Device devices = new Monitor(device);
        Room room = new Room(intRoomId, devices);
        roomList.add(room);
        return "Home";
    }
    @GetMapping("/show")
    public String showRooms(Model model){
        String allRooms = "";
        for(Room room: roomList){
            allRooms += "<tr><td>%s</td><td>%s</td></tr>".formatted(room.getId(),room.getDevices());
        }
        model.addAttribute("roomTable", allRooms);
        return "AllRooms";
    }
}

