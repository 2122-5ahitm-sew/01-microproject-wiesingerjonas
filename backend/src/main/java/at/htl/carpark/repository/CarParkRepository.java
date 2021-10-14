package at.htl.carpark.repository;

import at.htl.carpark.entity.CarPark;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

public class CarParkRepository implements PanacheRepository<CarPark> {
    public CarPark findById(Long id) {
        return find("id", id).firstResult();
    }
}
