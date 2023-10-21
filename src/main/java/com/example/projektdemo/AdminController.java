package com.example.projektdemo;

import com.example.location.Room;
import com.example.location.RoomRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class AdminController {
    private final RoomRepository roomRepository;

    public AdminController(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    @GetMapping("/rooms")
    public String createRooms(){
        return "einrichten";
    }
    @PostMapping("/rooms")
    public String doRoom()
}
