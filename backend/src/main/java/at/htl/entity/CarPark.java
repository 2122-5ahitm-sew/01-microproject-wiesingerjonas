package at.htl.entity;

import java.util.ArrayList;

public class CarPark {
    Long id;
    Double[] location;
    String name;
    ArrayList<ParkingSpots> spots = new ArrayList<ParkingSpots>();
}
