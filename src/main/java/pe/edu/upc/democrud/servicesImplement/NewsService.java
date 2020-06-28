package pe.edu.upc.democrud.servicesImplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.democrud.models.News;
import pe.edu.upc.democrud.models.Person;
import pe.edu.upc.democrud.repositories.INewsRepository;
import pe.edu.upc.democrud.services.INewsService;

import java.util.List;
import java.util.Optional;

@Service
public  class NewsService implements INewsService {
    @Autowired
    private INewsRepository newsRepository;

    @Override
    public News save(News news) throws Exception {
        return null;
    }

    @Override
    public void deleteById(Integer id) throws Exception {

    }

    @Override
    public Optional<News> findById(Integer id) throws Exception {
        return newsRepository.findById(id);
    }

    @Override
    public List<News> findAll() throws Exception {
        return null;
    }
}
