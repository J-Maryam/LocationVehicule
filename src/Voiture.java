import javax.xml.crypto.Data;
import java.sql.Date;

public class Voiture extends Vehicule {

    private int nombrePortes;
    private boolean automatique;

    public Voiture(int id, String modele, String marque, Data annee, float prixDeBase, int nombrePortes, boolean automatique) {
        super(id, modele, marque, annee, prixDeBase);
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
        return prixDeBase * jours;
    }

    public void afficherType(){
        System.out.println("La vehicule est de type Voiture");
    }

    public void obtenirDescription(){
        System.out.println("Description de la voiture ");
        System.out.println("La marque : " + marque);
        System.out.println("Le modele : " + modele);
        System.out.println("Annee : " + annee);
        System.out.println("Prix de base : " + prixDeBase);
        System.out.println("Nombre de portes : " + getNombrePortes());
        System.out.println("Automatique : " + isAutomatique());
    }

}
