import javax.xml.crypto.Data;

public class Moto extends Vehicule {

    private boolean toutTerrain;

    public Moto(int id, String marque, String modele, Data annee, float prixDeBase, boolean toutTerrain) {
        super(id, marque, modele, annee, prixDeBase);
        this.toutTerrain = toutTerrain;
    }

    public boolean isToutTerrain() {
        return toutTerrain;
    }

    public void setToutTerrain(boolean toutTerrain) {
        this.toutTerrain = toutTerrain;
    }

    public Float calculerPrixLocation(int jours){

        float prixLocation =  prixDeBase * jours;
        if(toutTerrain){
            prixLocation *= 0.2;
        }
        return prixLocation;
    }

    public void afficherType(){
        System.out.println("La vehicule est de type Moto");
    }

    public void obtenirDescription(){
        System.out.println("Description de la Moto");
        System.out.println("Marque : " + marque);
        System.out.println("Modele : " + modele);
        System.out.println("Annee : " + annee);
        System.out.println("Prix deBase : " + prixDeBase);
        System.out.println("ToutTerrain : " + isToutTerrain());
    }

}
