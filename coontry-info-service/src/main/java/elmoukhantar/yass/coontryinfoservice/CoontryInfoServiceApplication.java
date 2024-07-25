package elmoukhantar.yass.coontryinfoservice;

import elmoukhantar.yass.coontryinfoservice.entities.City;
import elmoukhantar.yass.coontryinfoservice.entities.Country;
import elmoukhantar.yass.coontryinfoservice.repository.Cityrepository;
import elmoukhantar.yass.coontryinfoservice.repository.Contryrepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.UUID;

@SpringBootApplication
@EnableFeignClients
public class CoontryInfoServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoontryInfoServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(Contryrepository countryrepository, Cityrepository cityrepository){
        return args -> {

            Country contry = new Country("Maroc","MAD",new ArrayList<>(),null,"Afrique");
            Country contry1 = new Country("France","EUR",new ArrayList<>(),null,"Europe");
            Country contry2 = new Country("Italie","EUR",new ArrayList<>(),null,"Europe");
            Country contry3 = new Country("Canada","CAD",new ArrayList<>(),null,"Amerique nord");
            Country contry4 = new Country("Arabie-saoudite","RIYAL",new ArrayList<>(),null,"Asie");
            Country contry5 = new Country("Russie","ROUBLE",new ArrayList<>(),null,"Asie");
            Country contry6 = new Country("Brazil","USD",new ArrayList<>(),null,"Amerique sud");
            countryrepository.save(contry);
            countryrepository.save(contry1);
            countryrepository.save(contry2);
            countryrepository.save(contry3);
            countryrepository.save(contry4);
            countryrepository.save(contry5);
            countryrepository.save(contry6);
            cityrepository.save(new City(UUID.randomUUID().toString(),"Casablanca",contry));
            cityrepository.save(new City(UUID.randomUUID().toString(),"Rabat",contry));
            cityrepository.save(new City(UUID.randomUUID().toString(),"Fes",contry));
            cityrepository.save(new City(UUID.randomUUID().toString(),"Paris",contry1));
            cityrepository.save(new City(UUID.randomUUID().toString(),"Nice",contry1));
            cityrepository.save(new City(UUID.randomUUID().toString(),"Ariyad",contry5));
            cityrepository.save(new City(UUID.randomUUID().toString(),"Moscow",contry2));
            cityrepository.save(new City(UUID.randomUUID().toString(),"newyork",contry3));
            cityrepository.save(new City(UUID.randomUUID().toString(),"washinton",contry3));
            countryrepository.save(contry);
            countryrepository.save(contry1);
            countryrepository.save(contry2);
            countryrepository.save(contry3);
            countryrepository.save(contry4);
            countryrepository.save(contry5);
            countryrepository.save(contry6);
        };
    }

}
