package exo1;
abstract class VehiculeTerrestre implements Vehicule{
    private int nombreRoues;

    public VehiculeTerrestre(int nombreRoues){
        this.nombreRoues = nombreRoues ;
    }

    public void afficherRoues(){
        System.out.println("Ce Vehicule a :"+nombreRoues+ "roues");
    }


}