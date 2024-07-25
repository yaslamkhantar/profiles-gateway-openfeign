package elmoukhantar.yass.coontryinfoservice.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import elmoukhantar.yass.coontryinfoservice.model.Continent;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Transient;
import lombok.*;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Country {
    @Id
    private String countryid;
    //  private String religion;
    private String devis;
    @OneToMany(mappedBy = "contry")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private List<City> cities;
    @Transient
    private Continent continent;

    private String continentname;





}
