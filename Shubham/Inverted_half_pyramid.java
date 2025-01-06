// Source code is decompiled from a .class file using FernFlower decompiler.
package Shubham;

import java.util.Scanner;

public class Inverted_half_pyramid {
   public Inverted_half_pyramid() {
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the rows");
      int a = sc.nextInt();

      for(int i = 1; i <= a; ++i) {
         int j;
         for(j = 1; j <= a - i; ++j) {
            System.out.print(" ");
         }

         for(j = 1; j <= i; ++j) {
            System.out.print("*");
         }

         System.out.println();
      }

   }
}
