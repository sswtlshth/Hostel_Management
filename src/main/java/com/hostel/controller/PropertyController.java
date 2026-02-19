package com.hostel.controller;

import com.hostel.Property;
import com.hostel.com.hostel.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/property")
public class PropertyController {
    @Autowired
    PropertyService propertyService;

    @GetMapping
    public ResponseEntity<List<Property>> getProperties(){
        return new ResponseEntity<>(propertyService.getPropertyList(), HttpStatus.OK);
    }


}
