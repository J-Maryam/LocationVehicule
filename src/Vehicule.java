import javax.xml.crypto.Data;

abstract public class Vehicule {

    protected int id;
    protected String marque;
    protected String modele;
    protected Data annee;
    protected Float prixDeBase;

    public Vehicule(int id, String marque, String modele, Data annee, float prixDeBase) {
        this.id = id;
        this.marque = marque;
        this.modele = modele;
        this.annee = annee;
        this.prixDeBase = prixDeBase;
    }

    abstract public Float calculerPrixLocation(int jours);

    abstract public void afficherType();

    abstract public void obtenirDescription();

}
