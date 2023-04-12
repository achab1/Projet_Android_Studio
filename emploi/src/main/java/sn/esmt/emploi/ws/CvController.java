package sn.esmt.emploi.ws;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import sn.esmt.emploi.dao.CvRepository;
import sn.esmt.emploi.entities.CvEntity;

import java.util.List;


@RestController
@RequestMapping(value = "/cvs")
@AllArgsConstructor
public class CvController {

    //Fonction qui insere dans la base de donnee
    private CvRepository cvRepository;

    @PostMapping(path = "/save")
    public CvEntity save(@RequestBody CvEntity cvEntity){
        return cvRepository.save(cvEntity);
    }

    //spÃ©cifie que cette mÃ©thode doit Ãªtre appelÃ©e
    // lorsqu'une requÃªte HTTP GET est envoyÃ©e Ã  l'URL /users/alls
    @GetMapping(path = "/all")
    public List<CvEntity> getAll(){
        return cvRepository.findAll();
    }




}
