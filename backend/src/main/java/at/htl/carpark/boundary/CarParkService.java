package at.htl.carpark.boundary;

import at.htl.carpark.entity.CarPark;
import at.htl.carpark.repository.CarParkRepository;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/carpark")
@Produces(MediaType.APPLICATION_JSON)
public class CarParkService {
    @Inject
    CarParkRepository carParkRepository;

    @GET
    public List<CarPark> getAll() {
        return carParkRepository.listAll();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public CarPark post(CarPark carPark) {
        return carParkRepository.save(carPark);
    }

    @GET
    @Path("{id}")
    public CarPark getOne(@PathParam("id") Long id) {
        return carParkRepository.findById(id);
    }
}
