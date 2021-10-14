package at.htl.carpark.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {

    @Id
    Long customerId;

    String firstName;

    String lastName;

    String licensePlate;
}
