package at.htl.carpark.boundary;

import at.htl.carpark.entity.ParkingSpots;
import at.htl.carpark.entity.Person;
import at.htl.carpark.repository.ParkingSpotsRepository;
import at.htl.carpark.repository.PersonRepository;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

public class PersonService {
    @Inject
    PersonRepository personRepository;

    @GET
    public List<Person> getAll() {
        return personRepository.listAll();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Person post(Person person) {
        return personRepository.save(person);
    }

    @GET
    @Path("{id}")
    public Person getOne(@PathParam("id") Long id) {
        return personRepository.findById(id);
    }
}
