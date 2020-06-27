package pe.edu.upc.democrud.servicesImplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.democrud.repositories.IPeopleRepository;
import pe.edu.upc.democrud.services.IPeopleService;
import pe.edu.upc.democrud.models.Person;

import java.util.List;
import java.util.Optional;

@Service
public class PeopleService implements IPeopleService {
    @Autowired
    private IPeopleRepository peopleRepository;


    @Override
    public Person save(Person person) throws Exception {

        Person persona = peopleRepository.save(person);

        return person;
    }

    @Override
    public void deleteById(Integer id) throws Exception {
            peopleRepository.deleteById(id);
    }

    @Override
    public Optional<Person> findById(Integer id) throws Exception {
        return peopleRepository.findById(id);
    }

    @Override
    public List<Person> findAll() throws Exception {
        return (List<Person>)peopleRepository.findAll();
    }
}
