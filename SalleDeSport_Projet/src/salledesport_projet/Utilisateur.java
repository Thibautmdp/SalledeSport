/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salledesport_projet;

/**
 *
 * @author maxen
 */
public class Utilisateur {
    private String email;
    private String mdp;
    
    
    public Utilisateur(String email, String mdp){
        this.email = email;
        this.mdp = mdp;
        
    }
    
    
    public String getemail(String email){
        return email;
    }
    
    public String getmdp(String mdp){
        return mdp;
    }
}