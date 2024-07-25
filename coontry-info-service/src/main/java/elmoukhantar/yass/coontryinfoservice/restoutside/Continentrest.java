package elmoukhantar.yass.coontryinfoservice.restoutside;

import elmoukhantar.yass.coontryinfoservice.model.Continent;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "CONTINNENT-SERVICE")
public interface Continentrest {

    @GetMapping("/ContienentRest/{name}")
    @CircuitBreaker(name = "customerservice",fallbackMethod = "getcontient")
    Continent getcontinent(@PathVariable String name);

    default Continent getcontient(String name,Exception exception){
        Continent continent = new Continent();
        continent.setName(name);
        continent.setPopulation(000);
        return continent;
    }

}
