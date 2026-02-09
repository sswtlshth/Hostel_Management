package com.hostel.com.hostel.service;

import com.hostel.Bed;
import com.hostel.Property;
import com.hostel.Room;
import com.hostel.TypeOfRooms;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class PropertyService {

    public List<Property> getPropertyList() {
        return propertyList;
    }

    public boolean addProperty(Property property) {
        return propertyList.add(property);
    }
    List<Property> propertyList= new ArrayList<>();
    PropertyService(){
        Bed b1 = new Bed(1L,300.0,1200.0,true);
        Bed b2 = new Bed(1L,300.0,1200.0,true);
        Bed b3 = new Bed(1L,400.0,160.00,true);
        Bed b4 = new Bed(1L,700.0,1900.0,true);
        Bed b5 = new Bed(1L,900.0,2200.0);
        Bed b6 = new Bed(1L,500.0,2700.0);

        Room room1 = new Room(1L, "A1", TypeOfRooms.TRIPLE_SHARING, Arrays.asList(b1,b2,b3));
        Room room2 = new Room(1L, "A1", TypeOfRooms.TRIPLE_SHARING, Arrays.asList(b4,b5,b6));
        Property p1 = new Property( "A", "Pune", 1L, Arrays.asList(room1,room2));
        propertyList.add(p1);

        System.out.println("List of Properties"+propertyList);
    }


}
