package elmoukhantar.yass.continnentservice.web;

import elmoukhantar.yass.continnentservice.dao.Contienentrepository;
import elmoukhantar.yass.continnentservice.entite.Continent;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ContienentRest")
@AllArgsConstructor
public class Contientweb {

    private Contienentrepository contienentrepository;

    @GetMapping("/contienents")
    public List<Continent> getallcontienent(){
        return contienentrepository.findAll();
    }

    @GetMapping("/{name}")
    public Continent getcontienentbyname(@PathVariable String name){
        return contienentrepository.findById(name).get();
    }

}
