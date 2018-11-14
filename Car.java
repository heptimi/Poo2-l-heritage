public class Car extends Vehicle{

    public Car(String brand){
        super(brand);
    }

    @Override
    public String doStuff(){
    return String.format("je suis %s et je fais vroum vroum !",
            this.getBrand());
    }
}
