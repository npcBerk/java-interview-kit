package interviewkit.spring.item;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

@Service
@Transactional(readOnly = true)
public class ItemService {

    private final ItemRepository repository;

    public ItemService(ItemRepository repository) {
        this.repository = repository;
    }

    public List<Item> findAll(String query) {
        return query == null ? repository.findAll() : repository.findByNameContainingIgnoreCase(query);
    }

    public Item findById(long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Item " + id + " yok"));
    }

    @Transactional
    public Item create(ItemRequest request) {
        return repository.save(new Item(request.name(), request.quantity()));
    }

    @Transactional
    public void delete(long id) {
        repository.delete(findById(id));
    }
}
