import java.io.*;
import java.util.*;


public class Main {
  
   public static void main(String[] args) {
   Scanner scan = new Scanner(System.in);
   System.out.println("Enter the number of days later:");
   int n = scan.nextInt();
   if(n <= 0 && n > 30) {
   System.out.println("Invalid entry");
   } 
  else if(n % 2 == 0) {
    System.out.println("White");
    } else {
    System.out.println("Black");
  }
   }
 
  }
