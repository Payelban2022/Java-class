abstract class Animals {
public abstract void animalsSound();
public void sleep(){
    System.out.println("Zzz");
}}
//Subclass inherit from animals
class Pigs extends Animals{
    public void animalsSound(){
        //the body of animalsSound() is provided here
        System.out.println("The pig says: wee wee");

    }
}
class Main1{
    public static void main(String[] args){
        Pigs myPig = new Pigs();
        myPig.animalsSound();
        myPig.sleep();
    }

}