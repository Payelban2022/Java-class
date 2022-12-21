import java.util.Scanner;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

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

         ArrayList<String>cars = new ArrayList<String>();
         cars.add("Volvo");
         cars.add("BMW");
         cars.add("Ford");
         cars.add("Mazda");
         System.out.println(cars);
         System.out.println(cars.get(0));
         cars.set(0,"Opel");
         System.out.println(cars);

         for(int i = 0; i<cars.size();i++){
             System.out.println(cars.get(i));
         }
         Collections.sort(cars);
         for (String i :cars){
             System.out.println(i);
         }
         ArrayList<Integer>Num = new ArrayList<Integer>();
         Num.add(33);
         Num.add(15);
         Num.add(20);
         Num.add(34);
         Num.add(8);
         Num.add(12);
         Collections.sort(Num);
         for(int i : Num){
             System.out.println(i);
         }
        LinkedList<String>countries = new LinkedList<String>();
         countries.add("India");
         countries.add("USA");
         countries.add("Argentina");
         countries.add("France");
         System.out.println(countries);
         for (int i = 0;  i < countries.size();i++){
             System.out.println(countries.get(i));
         }
         countries.addLast("Brazil");
         System.out.println(countries);
         System.out.println(countries.getFirst());

         HashMap<String, String > capitalCities = new HashMap<String, String>();
         capitalCities.put("England","London");
         capitalCities.put("Germany","Berlin");
         capitalCities.put("Norway","Oslo");
         capitalCities.put("India","New Delhi");
         System.out.println(capitalCities);
         System.out.println(capitalCities.get("England"));
         for (String i : capitalCities.values()){
             System.out.println(i);
         }
        for (String i : capitalCities.keySet()){
            System.out.println(i);
        }
        for (String i : capitalCities.keySet()){
            System.out.println("Country: "+i +" Capital: "+ capitalCities.get(i));
        }

        HashSet<Integer>numbers = new HashSet<Integer>();
        numbers.add(4);
        numbers.add(7);
        numbers.add(8);

        for (int i = 0; i<10; i++){
            if (numbers.contains(i)){
                System.out.println(i + " was found in the set");

            } else{
                System.out.println(i + " was not found in the set");
            }
        }

        Iterator<String>it = cars.iterator();
         System.out.println(it.next());

         while(it.hasNext()){
             System.out.println(it.next());
         }

         Integer myInt = 100;
         String myString = myInt.toString();
         System.out.println(myString);
         System.out.println(myString.length());




     }


}
