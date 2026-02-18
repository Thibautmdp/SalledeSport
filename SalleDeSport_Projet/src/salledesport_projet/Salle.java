/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salledesport_projet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maxen
 */
public class Salle {
    private String Nom;
    private List<Client> Liste_des_clients;
    private Admin Administrateur;
    private List<Cours> Liste_des_cours_futurs;
    private List<Cours> Liste_des_cours_passés;
    private String Nom_du_fichier_sauvegarder;
    
    public Salle(String Nom,String fichier){
        this.Nom = Nom;
        this.Nom_du_fichier_sauvegarder = fichier;
        this.Liste_des_clients = new ArrayList<>();
        this.Liste_des_cours_futurs = new ArrayList<>();
        this.Liste_des_cours_passés = new ArrayList<>();
        this.Administrateur = new Admin("Max.admin@admin.fr","mdpadmin");
        
    }
    
    
    public Object SeConnecter(String email, String mdp) {
        
        if (email.equals("Max.admin@admin.fr") && mdp.equals("mdpadmin")) {
            System.out.println("Bienvenue Administrateur");
        
        }else {
            for (Client c : Liste_des_clients) {
                if (c.getEmail().equals(email) && c.getMotDePasse().equals(mdp)) {
                    System.out.println("Bienvenue " + c.getNom());
                }
            }
            System.out.println("Identifiants incorrects.");
        }
        return null;
    }
    
    public String Afficher(){
        a
    }

}



  