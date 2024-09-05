import javax.xml.crypto.Data;

public class Moto extends Vehicule {

    private boolean toutTerrain;

    public Moto(int id, String marque, String modele, Data annee, boolean toutTerrain) {
        super(id, marque, modele, annee);
        this.toutTerrain = toutTerrain;
    }

    public boolean isToutTerrain() {
        return toutTerrain;
    }

    public void setToutTerrain(boolean toutTerrain) {
        this.toutTerrain = toutTerrain;
    }

    public Float calculerPrixLocation(int jours){
        return getPrixDeBase() * jours;
    }

    public void afficherType(){
        System.out.println("La vehicule est de type Moto");
    }

    public void obtenirDescription(){
        System.out.println("Description de la Moto");
        System.out.println("Marque : " + getMarque());
        System.out.println("Modele : " + getModele());
        System.out.println("Annee : " + getAnnee());
        System.out.println("ToutTerrain : " + isToutTerrain());
    }

}
