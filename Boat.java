public class Boat extends Vehicle{

    public Boat(String brand){
        super(brand);
    }

    @Override
    public String doStuff(){
        return String.format("je suis %s et je fais glouglou !",
                this.getBrand());
    }
}
