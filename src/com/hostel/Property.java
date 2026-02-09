package com.hostel;

import java.util.List;

public record Property(String propertyName, String address, Long propertyId, List<Room> roomList){

}
