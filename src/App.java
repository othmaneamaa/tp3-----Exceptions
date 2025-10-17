import java.security.PrivilegedActionException;
import java.util.ArrayList;
import java.util.List;

import exo1.Moto;
import exo1.Vehicule;
import exo1.Voiture;
import exo2.PrixInvalideException;
import exo2.Produit;

public class App {
    public static void main(String[] args) throws Exception {
        //Exercice 1:
        /*Vehicule [] listVehicules = {new Voiture() , new Moto() ,null };
    try{
        for(Vehicule v : listVehicules){
        if(v == null){
            throw new NullPointerException ("Le vehicule est null");
        }
        v.seDeplacer();
        }
    }catch(NullPointerException e){
        System.out.println("ERREUR : " +e.getMessage() );
    }
    catch (Exception e ){
        System.out.println("Erreur" +e.getMessage());

    }finally {
        System.out.println("Fin du programme");
    }


    }*/

    //Exercice 2:
    List<Produit> produits = new ArrayList<>();
        String [] noms = {"Ordinateur", "Smartphone", "Tablette", "Casque Audio"};
        double [] prix = {999.99, 699.49, -299.99, 149.99};
        for(int i=0; i<noms.length ; i++){
            try{
                Produit p = new Produit (noms[i], prix[i]);
                if(prix[i]<0){
                    throw new PrixInvalideException("Le prix ne peut pas être négatif: " + prix[i]);
                }
                produits.add(p);
            }catch(PrixInvalideException e){
                System.out.println("Erreur : " + e.getMessage());
            }catch(Exception e){
                System.out.println("Erreur :" + e.getMessage());
            }finally{
                System.out.println("Traitement terminé.");
            }
        }
    }
}


