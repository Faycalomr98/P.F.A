package com.gestion_agile.Web;

import com.gestion_agile.Entities.EquipeScrum;
import com.gestion_agile.Entities.Projet;
import com.gestion_agile.Entities.Utilisateur;
import com.gestion_agile.Services.EquipeServices;
import com.gestion_agile.Services.ProjetServices;
import com.gestion_agile.Services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/user")
public class Controller {
    private final UserServices userServices;
    private final ProjetServices projetServices;
    private final EquipeServices equipeServices ;

    @Autowired
    public  Controller(UserServices userServices, ProjetServices projetServices , EquipeServices equipeServices){
        this.userServices=userServices;
        this.projetServices = projetServices;
        this.equipeServices = equipeServices;
    }
    @PostMapping("/saveUser")
    public ResponseEntity<Utilisateur> saveUser(@RequestBody Utilisateur user) {
        return  ResponseEntity.ok(user);

    }
    @GetMapping("/getallUsers")
    public List<Utilisateur> getAllUsers() {
        return userServices.listAll();
    }

    @GetMapping("/searchUser/{id}")
    public Utilisateur getUserById(@PathVariable Integer id) {
        return userServices.getUserById(id);
    }

//    @GetMapping("/{Name}/{password}")
//    public Utilisateur getUserByEmailAndPassword(@PathVariable String Name ,@PathVariable String password){
//        return userServices.getUser(Name,password);
//    }


    @PostMapping("/saveProjet")
    public ResponseEntity<Projet> saveProject(@RequestBody Projet projet) {
        return  ResponseEntity.ok(projet);
    }
    @GetMapping("/getallProjects")
    public List<Projet> getAllProjects() {
        return projetServices.listAll();
    }

    @GetMapping("/searchProject/{id}")
    public Projet getProjetById(@PathVariable Integer id) {
        return projetServices.getProjetById(id);
    }

    @PostMapping("/saveEquipe")
    public ResponseEntity<EquipeScrum> saveEquipe(@RequestBody EquipeScrum equipeScrum) {
        return  ResponseEntity.ok(equipeScrum);
    }
    @GetMapping("/getallEquipes")
    public List<EquipeScrum> getAllEquips() {
        return equipeServices.listAll();
    }

    @GetMapping("/searchEquipe/{id}")
    public EquipeScrum getEquipeById(@PathVariable Integer id) {
        return equipeServices.getEquipeById(id);
    }
}
