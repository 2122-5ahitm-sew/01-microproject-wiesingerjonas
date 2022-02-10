package at.htl.carpark.boundary;

import at.htl.carpark.entity.CarPark;
import at.htl.carpark.entity.ParkingSpots;
import at.htl.carpark.repository.CarParkRepository;
import at.htl.carpark.repository.ParkingSpotsRepository;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

public class ParkingSpotsService {
    @Inject
    ParkingSpotsRepository parkingSpotsRepository;

    @GET
    public List<ParkingSpots> getAll() {
        return parkingSpotsRepository.listAll();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public ParkingSpots post(ParkingSpots parkingSpots) {
        return parkingSpotsRepository.save(parkingSpots);
    }

    @GET
    @Path("{id}")
    public ParkingSpots getOne(@PathParam("id") Long id) {
        return parkingSpotsRepository.findById(id);
    }
}
