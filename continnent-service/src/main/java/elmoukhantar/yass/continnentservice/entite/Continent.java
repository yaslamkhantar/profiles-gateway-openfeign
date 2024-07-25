package elmoukhantar.yass.continnentservice.entite;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.RestController;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Continent {
    @Id
    private String name;
    private Integer population;
    private String surfaceArea;

}
