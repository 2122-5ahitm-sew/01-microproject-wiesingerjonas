package at.htl.carpark.repository;

import at.htl.carpark.entity.ParkingSpots;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;

@ApplicationScoped
@Transactional
public class ParkingSpotsRepository implements PanacheRepository<ParkingSpots> {
    public ParkingSpots findById(Long id) {
        return find("id", id).firstResult();
    }

    public ParkingSpots save(ParkingSpots parkingSpots) {
        return getEntityManager().merge(parkingSpots);
    }
}
