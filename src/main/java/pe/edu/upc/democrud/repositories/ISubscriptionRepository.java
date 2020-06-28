package pe.edu.upc.democrud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.democrud.models.Subscription;

@Repository
public interface ISubscriptionRepository extends JpaRepository<Subscription, Integer> {
}
