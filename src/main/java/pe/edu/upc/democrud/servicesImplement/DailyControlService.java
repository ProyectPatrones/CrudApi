package pe.edu.upc.democrud.servicesImplement;

import org.springframework.stereotype.Service;
import pe.edu.upc.democrud.models.News;
import pe.edu.upc.democrud.services.IDailyControlService;

import java.util.List;
import java.util.Optional;
@Service
public class DailyControlService  implements IDailyControlService {
    @Override
    public News save(News news) throws Exception {
        return null;
    }

    @Override
    public void deleteById(Integer id) throws Exception {

    }

    @Override
    public Optional<News> findById(Integer id) throws Exception {
        return Optional.empty();
    }

    @Override
    public List<News> findAll() throws Exception {
        return null;
    }
}