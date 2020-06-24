package pe.edu.upc.democrud.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.democrud.Interface.IPersona;
import pe.edu.upc.democrud.InterfaceService.IpersonaService;
import pe.edu.upc.democrud.Model.Persona;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaService implements IpersonaService {
    @Autowired
    private IPersona data;

    @Override
    public List<Persona> listar() {
        return (List<Persona>)data.findAll();
    }

    @Override
    public Optional<Persona> listarId(int id) {
        return Optional.empty();
    }

    @Override
    public int save(Persona p) {
        return 0;
    }

    @Override
    public void delete(int id) {

    }
}