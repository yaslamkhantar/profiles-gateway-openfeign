package elmoukhantar.yass.continnentservice;

import elmoukhantar.yass.continnentservice.dao.Contienentrepository;
import elmoukhantar.yass.continnentservice.entite.Continent;
import elmoukhantar.yass.continnentservice.service.Contienentservice;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ContinnentServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ContinnentServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(Contienentrepository contienentrepository, Contienentservice contienentservice){
        return args -> {
            Continent c1 = new Continent("Afrique",29931,"44M");
            contienentservice.addContinent(c1);
            Continent c2 = new Continent("Amerique Sud",15000,"50M");
            contienentservice.addContinent(c2);
            Continent c3 = new Continent("Amerique Nord",19876,"2M");
            contienentservice.addContinent(c3);
            Continent c4 = new Continent("Asie",22346,"29M");
            contienentservice.addContinent(c4);
            Continent c5 = new Continent("Europe",221111,"15M");
            contienentservice.addContinent(c5);




        };
    }

}
