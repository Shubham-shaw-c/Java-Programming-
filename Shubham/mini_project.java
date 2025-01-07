// Source code is decompiled from a .class file using FernFlower decompiler.
package Shubham;

import java.util.Scanner;

public class mini_project {
   public mini_project() {
   }

   public static void main(String[] args) {
      int mynumber = (int)(Math.random() * 100.0);
      Scanner sc = new Scanner(System.in);

      int guess;
      do {
         System.out.println("Guess the number");
         guess = sc.nextInt();
         if (guess == mynumber) {
            System.out.println("Your number is same");
            break;
         }

         if (guess > mynumber) {
            System.out.println("Your number is greater than the number");
         } else {
            System.out.println("Your number is smaller than the number");
         }
      } while(guess >= 0);

      System.out.println("The number was:  ");
      System.out.println(mynumber);
   }
}