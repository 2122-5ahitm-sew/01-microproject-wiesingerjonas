package at.htl.carpark.repository;

import at.htl.carpark.entity.ParkingSpots;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

public class ParkingSpotsRepository implements PanacheRepository<ParkingSpots> {
    public ParkingSpots findById(Long id) {
        return find("id", id).firstResult();
    }
}
