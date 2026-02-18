/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salledesport_projet;

/**
 *
 * @author maxen
 */
public class Client extends Utilisateur{
    
    private String NumClient;
    private String NomClient;
    private String PrenomClient;
    private String TelClient;
    private String AdresseClient;
    private String Abonnement; 
    private String EtatAbonnement;
    private String ListeCourPasse;
    private String ListeCourfuture;
    
    
    
    public Client (String NumClient){
    this.NumClient=NumClient;
    this.NomClient=NomClient;
    this.PrenomClient=PrenomClient;
    this.TelClient=TelClient;
    this.TelClient=TelClient;
    this.AdresseClient=AdresseClient;
    this.Abonnement=Abonnement;
    
    }
    public Client(String email, String mdp) {
        super(email, mdp);
    }

    Object getEmail() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Object getMotDePasse() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String getNom() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public void ConsulterSonCompte(String NomClient,String PrenomClient){
        System.out.println("compte");
    
    }
    public String CreerUnCompte(String NomClient, String prenom Client){
        return ();
    
    }
    public String MAJ () {
    }
    public String inscriptionCour (){
    }
    public Void ConsulterCoursFutur(){
    System.out.println(listecours);
    }
    public void ConsulterCoursPasse(){
    }
    public String DesinscrireCours(){
    }
    
    public  Stirng ConsulterListeActivite(){
    }
}
