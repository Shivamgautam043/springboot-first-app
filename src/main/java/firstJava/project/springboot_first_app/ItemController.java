package firstJava.project.springboot_first_app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class ItemController {

    @Autowired
    private ItemRepository itemRepository;

    @GetMapping("/items")
    public List<Item> getAllItems() {
        return itemRepository.findAll(); // Bas call karke check kar
    }
}
