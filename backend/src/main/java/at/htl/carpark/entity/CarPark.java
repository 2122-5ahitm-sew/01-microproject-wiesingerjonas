package at.htl.carpark.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.ArrayList;

@Entity
public class CarPark extends PanacheEntityBase {

    @Id
    Long id;

    Double longitude;  //location in decimal degrees

    Double latitude;  //location in decimal degrees

    String name;        //name of the car park (example: "Garage Promenade Linz")

    public CarPark() {
    }
}
