public class learning {
    int x = 5;
    static void myMethod(){
        System.out.println("Hello World!");
    }
    static void myStaticMethod(){
        System.out.println("Static methods can be called without creating objects");
    }
    public void myPublicMethod(){
        System.out.println("Public methods must be called by creating objects");
    }
    public void fullThrottle(){
        System.out.println("The car is going as fast as it can!");}

    public void speed(int maxSpeed) {
            System.out.println("Max speed is: " + maxSpeed);
        }

    int y;

   public learning(){
       y = 10;
   }
    int modelYear;
   String modelName;

   public learning(int year, String name){
       modelYear = year;
       modelName = name;
   }


    public static void main(String[] args){
        learning myObj1 = new learning();
        learning myObj2 = new learning();
        System.out.println(myObj1.x);
        System.out.println(myObj2.x);
        myMethod();
        myStaticMethod();
        learning myObj3 = new learning();
        myObj3.myPublicMethod();
        learning myCar =    new learning();
        myCar.fullThrottle();
        myCar.speed(200);
        learning myObj4 = new learning();
        System.out.println(myObj4.y);
        learning myCar1 = new learning(1969, "Mustang");
        System.out.println(myCar1.modelName + " is created in "+ myCar1.modelYear);




    }


    }






