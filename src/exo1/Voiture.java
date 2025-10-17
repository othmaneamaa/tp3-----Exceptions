package exo1;

public class Voiture extends VehiculeTerrestre {
    public Voiture(){
        super(4);
    }

    @Override
    public void seDeplacer(){
        System.out.println("je roule sur quatre roues");
    }

}
