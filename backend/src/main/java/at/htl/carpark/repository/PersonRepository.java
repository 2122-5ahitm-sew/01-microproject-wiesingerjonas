package at.htl.carpark.repository;

import at.htl.carpark.entity.Person;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;

@ApplicationScoped
@Transactional
public class PersonRepository implements PanacheRepository<Person> {
    public Person findById(Long id) {
        return find("id", id).firstResult();
    }

    public Person save(Person person) {
        return getEntityManager().merge(person);
    }
}
