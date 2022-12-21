interface Animal1 {
    public void Animal1Sound();
    public void Sleep1();
}
class Pig1 implements Animal1{
    public void Animal1Sound(){
        System.out.println("The pig says: Wee wee");
    }
    public void Sleep1(){
        System.out.println("ZZz");
    }
}
class Main2 {
    public static void main(String args[]){
        Pig1 myPig = new Pig1();
        myPig.Animal1Sound();
        myPig.Sleep1();
    }
}