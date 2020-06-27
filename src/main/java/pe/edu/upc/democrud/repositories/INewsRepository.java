package pe.edu.upc.democrud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.democrud.models.News;

@Repository
public interface INewsRepository extends JpaRepository<News, Integer> {
}
