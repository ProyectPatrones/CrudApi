package pe.edu.upc.democrud.servicesImplement;

import org.springframework.stereotype.Service;
import pe.edu.upc.democrud.models.Card;
import pe.edu.upc.democrud.services.ICardService;

import java.util.List;
import java.util.Optional;
@Service
public class CardService implements ICardService {
    @Override
    public Card save(Card card) throws Exception {
        return null;
    }

    @Override
    public void deleteById(Integer id) throws Exception {

    }

    @Override
    public Optional<Card> findById(Integer id) throws Exception {
        return Optional.empty();
    }

    @Override
    public List<Card> findAll() throws Exception {
        return null;
    }
}
