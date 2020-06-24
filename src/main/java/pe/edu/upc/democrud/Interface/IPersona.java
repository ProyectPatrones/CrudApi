package pe.edu.upc.democrud.Interface;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.democrud.Model.Persona;

@Repository
public interface IPersona extends CrudRepository<Persona, Integer > {
}
