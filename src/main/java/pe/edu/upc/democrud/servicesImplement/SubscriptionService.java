package pe.edu.upc.democrud.servicesImplement;

import org.springframework.stereotype.Service;
import pe.edu.upc.democrud.models.Subscription;
import pe.edu.upc.democrud.services.ISubscriptionService;

import java.util.List;
import java.util.Optional;
@Service
public class SubscriptionService implements ISubscriptionService {
    @Override
    public Subscription save(Subscription subscription) throws Exception {
        return null;
    }

    @Override
    public void deleteById(Integer id) throws Exception {

    }

    @Override
    public Optional<Subscription> findById(Integer id) throws Exception {
        return Optional.empty();
    }

    @Override
    public List<Subscription> findAll() throws Exception {
        return null;
    }
}
