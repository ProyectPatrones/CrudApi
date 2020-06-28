package pe.edu.upc.democrud.servicesImplement;

import org.springframework.stereotype.Service;
import pe.edu.upc.democrud.models.Clinic;
import pe.edu.upc.democrud.services.IClinicService;
import pe.edu.upc.democrud.services.ICrudService;

import java.util.List;
import java.util.Optional;
@Service
public class ClinicService implements IClinicService {
    @Override
    public Clinic save(Clinic clinic) throws Exception {
        return null;
    }

    @Override
    public void deleteById(Integer id) throws Exception {

    }

    @Override
    public Optional<Clinic> findById(Integer id) throws Exception {
        return Optional.empty();
    }

    @Override
    public List<Clinic> findAll() throws Exception {
        return null;
    }
}
