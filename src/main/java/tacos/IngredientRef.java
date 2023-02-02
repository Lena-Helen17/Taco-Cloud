package tacos;

import lombok.Data;
import org.springframework.data.repository.CrudRepository;

@Data
public class IngredientRef  {

    private final String ingredient;
}
