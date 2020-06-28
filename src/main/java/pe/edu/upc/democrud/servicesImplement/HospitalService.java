package pe.edu.upc.democrud.servicesImplement;

import org.springframework.stereotype.Service;
import pe.edu.upc.democrud.models.Hospital;
import pe.edu.upc.democrud.services.IHospitalService;

import java.util.List;
import java.util.Optional;
@Service
public class HospitalService implements IHospitalService {
    @Override
    public Hospital save(Hospital hospital) throws Exception {
        return null;
    }

    @Override
    public void deleteById(Integer id) throws Exception {

    }

    @Override
    public Optional<Hospital> findById(Integer id) throws Exception {
        return Optional.empty();
    }

    @Override
    public List<Hospital> findAll() throws Exception {
        return null;
    }
}
