public abstract class Vehicle {

    //attributs
   private String brand;
   private int kilometers;

    //Constructeur
    public Vehicle (String brand){
        this.brand = brand;
        this.kilometers= 0;
    }

    //accesseurs et mutateurs
    public String getBrand(){
        return this.brand;
    }

    public int getKm() {
        return this.kilometers;
    }

    public void setBrand( String brand){
        this.brand = brand;
    }

    public void SetKm (int kilometers){
        this.kilometers= kilometers;
    }

    //methodes
    public abstract String doStuff();


}
