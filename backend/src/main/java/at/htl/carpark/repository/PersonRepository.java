package at.htl.carpark.repository;

import at.htl.carpark.entity.Person;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

public class PersonRepository implements PanacheRepository<Person> {
    public Person findById(Long id) {
        return find("id", id).firstResult();
    }
}
