package elmoukhantar.yass.coontryinfoservice.repository;

import elmoukhantar.yass.coontryinfoservice.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Contryrepository extends JpaRepository<Country,String> {
}
