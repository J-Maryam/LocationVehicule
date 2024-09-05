import javax.xml.crypto.Data;

abstract public class Vehicule {

    private int id;
    private String marque;
    private String modele;
    private Data annee;
    private Float prixDeBase;

    public Vehicule(int id, String marque, String modele, Data annee) {
        this.id = id;
        this.marque = marque;
        this.modele = modele;
        this.annee = annee;
        this.prixDeBase = prixDeBase;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public Data getAnnee() {
        return annee;
    }

    public void setAnnee(Data annee) {
        this.annee = annee;
    }

    public Float getPrixDeBase() {
        return prixDeBase;
    }

    public void setPrixDeBase(Float prixDeBase) {
        this.prixDeBase = prixDeBase;
    }

    abstract public Float calculerPrixLocation(int jours);

    abstract public void afficherType();

    abstract public void obtenirDescription();

}
