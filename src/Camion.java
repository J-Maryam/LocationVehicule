import javax.xml.crypto.Data;

public class Camion extends Vehicule {

    private float capaciteMax;

    public Camion(int id, String marque, String modele, Data annee, float prixDeBase, float capaciteMax){
        super(id, marque, modele, annee, prixDeBase);
        this.capaciteMax = capaciteMax;
    }

    public Float calculerPrixLocation(int jours){
        float prixLocation = prixDeBase * jours;

        if (capaciteMax > 10){
            prixLocation *= 0.3;
        }

        return prixLocation;
    }

    @Override
    public void afficherType() {
        System.out.println("La vehicule est de type Camion");
    }

    @Override
    public void obtenirDescription() {
        System.out.println("Description de la Camion");
        System.out.println("Marque : " + marque);
        System.out.println("Modele : " + modele);
        System.out.println("Annee : " + annee);
        System.out.println("Prix de base : " + prixDeBase);
        System.out.println("Capacite max : " + capaciteMax);
    }
}
