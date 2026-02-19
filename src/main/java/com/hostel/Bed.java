package com.hostel;

public record Bed(Long bedId, Double pricePerDay, Double PricePerMonth, boolean isAvailable  ) {
     public Bed(Long bedId, Double pricePerDay, Double PricePerMonth ){
        this( bedId,  pricePerDay, PricePerMonth , true );
    }
}
