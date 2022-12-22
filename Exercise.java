//Add 2 nos with user input
import java.io.*;
import java.util.List;
import java.util.Scanner;


 class Exercise {
     public static void main(String[] args) throws IOException {
         int x, y, sum;
         BufferedReader bufferedReader= new BufferedReader(new InputStreamReader(System.in));

         Scanner myObj = new Scanner(System.in);
         System.out.println("Give the 1st no.");
         x = myObj.nextInt();

         System.out.println("Give the 2nd no.");
         y = myObj.nextInt();

         sum = x+y;
         System.out.println("The sum is: "+sum);
//count the no of words

         System.out.println("Give the sentence");
         String words = bufferedReader.readLine();
         System.out.println(words);
         String[] wordList = words.split(" ");


         System.out.println("The no of words: "+ wordList.length);
     }

}
