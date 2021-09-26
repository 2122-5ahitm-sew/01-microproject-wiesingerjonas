package at.htl.entity;

import java.util.ArrayList;

public class CarPark {
    Long id;
    Double[] location;  //location in decimal degrees
    String name;        //name of the car park (example: "Garage Promenade Linz")
    ArrayList<ParkingSpots> spots = new ArrayList<ParkingSpots>();  //List of all parking spots in the car park
}
