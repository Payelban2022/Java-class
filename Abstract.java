abstract class Abstract{
    public String fname = "John";
    public int age = 24;
    public abstract void study();
}
// Subclass(inherit from the main class Abstract)
class Student extends Abstract{
    public int  graduationYear = 2018;


    public void study() {
        System.out.println("Studying all day long");


    }
}
 class Second{
    public static void main(String [] args){
        Student myObj = new Student();
        System.out.println("Name: "+ myObj.fname);
        System.out.println("Age: "+ myObj.age);
        System.out.println("GraduationYear: "+ myObj.graduationYear);
        myObj.study();
    }

}