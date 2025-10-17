package exo1;

public class Moto extends VehiculeTerrestre{
    public Moto(){
        super(2);
    }

    @Override
    public void seDeplacer() {
        System.out.println("je roule sur deux roues");
    }

}
