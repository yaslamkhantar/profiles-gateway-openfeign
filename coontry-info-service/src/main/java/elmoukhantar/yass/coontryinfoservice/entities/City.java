package elmoukhantar.yass.coontryinfoservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class City {
    @Id
    private String id;
    private String name;
    @ManyToOne
    private Country contry;
}
