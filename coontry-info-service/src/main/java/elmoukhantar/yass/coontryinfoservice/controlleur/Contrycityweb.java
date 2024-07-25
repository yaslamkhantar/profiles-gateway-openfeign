package elmoukhantar.yass.coontryinfoservice.controlleur;

import elmoukhantar.yass.coontryinfoservice.entities.City;
import elmoukhantar.yass.coontryinfoservice.entities.Country;
import elmoukhantar.yass.coontryinfoservice.model.Continent;
import elmoukhantar.yass.coontryinfoservice.repository.Cityrepository;
import elmoukhantar.yass.coontryinfoservice.repository.Contryrepository;
import elmoukhantar.yass.coontryinfoservice.restoutside.Continentrest;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest")
@AllArgsConstructor
public class Contrycityweb {

    private Cityrepository cityrepository;

    private Contryrepository countryrepository;

    private Continentrest continentrest;

    @GetMapping("/allCity")
    public List<City> findAllcity() {
        return cityrepository.findAll();
    }
    @GetMapping("/test2/{name}")
    public Country findcountrybycontinent(@PathVariable String name) {
     Country country =countryrepository.findById(name).get() ;
     Continent continent=continentrest.getcontinent(country.getContinentname());
     country.setContinent(continent);
     return country;
    }
    @GetMapping("/allContry")
    public List<Country> findAllcontry() {
        return countryrepository.findAll();
    }
    @GetMapping("/contry/{name}")
    public Country findCountryByName(String name){
        return countryrepository.findById(name).get();
    }
    @GetMapping("/city/{name}")
    public Country findCityByName(String name){
        return countryrepository.findById(name).get();
    }

}
