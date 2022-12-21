import java.util.Scanner;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class User {
     public static void main(String args[]) {
         Scanner myObj = new Scanner(System.in);
         LocalTime myObj1 = LocalTime.now();
         LocalDateTime myObj2 = LocalDateTime.now();
         DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
         System.out.println("Enter name, age and salary");

         String name = myObj.nextLine();
         int age = myObj.nextInt();
         double salary = myObj.nextDouble();
         System.out.println("Name: "+ name);
         System.out.println("Age: "+ age);
         System.out.println("Salary: "+ salary);


         System.out.println("Now the time is : "+ myObj1);
         System.out.println("Today date and time is : "+ myObj2);
         String formattedDate = myObj2.format(myFormatObj);
         System.out.println("Formated date: "+ formattedDate);

     }


}
