/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package salledesport_projet;

import java.util.ArrayList;

/**
 *
 * @author maxen
 */
public class SalleDeSport_Projet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
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
    #hhhhhhhhhhhhhhgdhicg
}
