public class Hangar{
    public static void main(String... args){

        //référénce vers les instances de classe
        Car vroum = new Car ("4x4");
        Boat glou = new Boat ("Paquebot");

        System.out.println(vroum.doStuff());
        System.out.println(glou.doStuff());

    }
}
