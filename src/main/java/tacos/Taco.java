package tacos;

import lombok.Data;
import java.util.List;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class Taco {

    @NotNull
    @Size(min = 5, message = "Name must be at least 5 characters long")
    // tag::allButValidation[]
    private String name;
    // end::allButValidation[]
    @Size(min = 1, message = "You must choose at least 1 ingredient")
    // tag::allButValidation[]
    private List<String> ingredients;
}
