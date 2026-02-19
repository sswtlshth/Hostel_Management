package com.hostel;

import java.util.List;

public record Room(Long roomId, String roomName, TypeOfRooms typeOfRooms, List<Bed> bedList){
}
