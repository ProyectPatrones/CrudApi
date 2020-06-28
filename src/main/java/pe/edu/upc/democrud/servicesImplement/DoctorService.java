package pe.edu.upc.democrud.servicesImplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.democrud.models.Doctor;
import pe.edu.upc.democrud.repositories.IDoctorRepository;
import pe.edu.upc.democrud.services.IDoctorService;

import java.util.List;
import java.util.Optional;

@Service
public class DoctorService implements IDoctorService {
    @Autowired
    private IDoctorRepository doctorRepository;

    @Override
    public Doctor save(Doctor doctor) throws Exception {
        Doctor doctor1 = doctorRepository.save(doctor);
        return doctor;
    }

    @Override
    public void deleteById(Integer id) throws Exception {
        doctorRepository.deleteById(id);
    }

    @Override
    public Optional<Doctor> findById(Integer id) throws Exception {
        return  doctorRepository.findById(id);
    }

    @Override
    public List<Doctor> findAll() throws Exception {
        return (List<Doctor>)doctorRepository.findAll();
    }
}
