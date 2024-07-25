package elmoukhantar.yass.continnentservice.service;

import elmoukhantar.yass.continnentservice.dao.Contienentrepository;
import elmoukhantar.yass.continnentservice.entite.Continent;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
@Transactional
public class Contienentservice {

    private Contienentrepository contienentrepository;

    public void addContinent(Continent continent){
        contienentrepository.save(continent);
    }
}
