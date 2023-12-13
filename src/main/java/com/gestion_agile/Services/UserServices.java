package com.gestion_agile.Services;

import com.gestion_agile.Entities.Utilisateur;
import com.gestion_agile.Repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServices {
 private final UserRepo userRepo;
 @Autowired
 public UserServices(UserRepo userRepo) {
     this.userRepo = userRepo;
 }

    public Utilisateur saveUser(Utilisateur user){
     return userRepo.save(user);
 }
    public Iterable<Utilisateur> listAll() {
        return userRepo.findAll();
    }

    public Utilisateur getUserById(Integer userId) {
        return userRepo.findById(userId).orElse(null);
    }

    public Utilisateur getUser(String Name, String password) {
//        Utilisateur user = new Utilisateur();
        return userRepo.findByNomUtilisateurAndPassword(Name, password).orElse(null);
    }
}
