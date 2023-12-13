package com.gestion_agile.Web;

import com.gestion_agile.Entities.Projet;
import com.gestion_agile.Entities.Utilisateur;
import com.gestion_agile.Services.ProjetServices;
import com.gestion_agile.Services.UserServices;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/v1/user")
public class Controller {
    private final UserServices userServices;
    private final ProjetServices projetServices;
    @Autowired
    public  Controller(UserServices userServices, ProjetServices projetServices){
        this.userServices=userServices;
        this.projetServices = projetServices;
    }
    @PostMapping("/saveUser")
    public ResponseEntity<Utilisateur> saveUser(@RequestBody Utilisateur user) {
        return  ResponseEntity.ok(user);

    }
    @GetMapping("/getallUsers")
    public Iterable<Utilisateur> getAllUsers() {
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
    public ResponseEntity<Projet> saveUser(@RequestBody Projet projet) {
        return  ResponseEntity.ok(projet);
    }
    @GetMapping("/getallUsers")
    public Iterable<Projet> getAllProjects() {
        return projetServices.listAll();
    }

    @GetMapping("/searchUser/{id}")
    public Projet getProjetById(@PathVariable Integer id) {
        return projetServices.getProjetById(id);
    }
}
