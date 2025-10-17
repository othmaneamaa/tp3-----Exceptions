package exo2;

public class Produit {
    private String nom;
    private double prix;

    public Produit(String nom , double prix){
        this.nom= nom;
        this.prix=prix;
    }
    public void afficherDetails(){
        System.out.println("Nom de Produit : "+nom+" le Prix de Prodeuit :" +prix);
    }

}
