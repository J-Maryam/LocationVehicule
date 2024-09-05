import javax.xml.crypto.Data;
import java.sql.Date;

public class Voiture extends Vehicule {

    private int nombrePortes;
    private boolean automatique;

    public Voiture(int id, String modele, String marque, Data annee, int nombrePortes, boolean automatique) {
        super(id, modele, marque, annee);
        this.nombrePortes = nombrePortes;
        this.automatique = automatique;
    }

    public int getNombrePortes() {
        return nombrePortes;
    }

    public void setNombrePortes(int nombrePortes) {
        this.nombrePortes = nombrePortes;
    }

    public boolean isAutomatique() {
        return automatique;
    }

    public void setAutomatique(boolean automatique) {
        this.automatique = automatique;
    }

    public Float calculerPrixLocation(int jours){
        return getPrixDeBase() * jours;
    }

    public void afficherType(){
        System.out.println("Cette vehicule est de type Voiture");
    }

    public void obtenirDescription(){
        System.out.println("Description de la voiture ");
        System.out.println("La marque : " + getMarque());
        System.out.println("Le modele : " + getModele());
        System.out.println("Annee : " + getAnnee());
        System.out.println("Prix de base : " + getPrixDeBase());
        System.out.println("Nombre de portes : " + getNombrePortes());
        System.out.println("Automatique : " + isAutomatique());
    }

}
