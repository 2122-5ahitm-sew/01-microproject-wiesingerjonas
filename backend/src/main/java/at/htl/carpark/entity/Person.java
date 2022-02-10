package at.htl.carpark.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person extends PanacheEntityBase {

    @Id
    Long customerId;

    String firstName;

    String lastName;

    String licensePlate;
}
