package at.htl.carpark.entity;

import at.htl.carpark.ParkingSpots;
import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.ArrayList;

@Entity
public class CarPark extends PanacheEntity {

    @Id
    Long id;

    Double[] location;  //location in decimal degrees

    String name;        //name of the car park (example: "Garage Promenade Linz")

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH})
    private ArrayList<ParkingSpots> spots = new ArrayList<at.htl.carpark.entity.ParkingSpots>();  //List of all parking spots in the car park
}
