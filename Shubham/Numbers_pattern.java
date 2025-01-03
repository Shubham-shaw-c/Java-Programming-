// Source code is decompiled from a .class file using FernFlower decompiler.
package Shubham;

import java.util.Scanner;

public class Numbers_pattern {
   public Numbers_pattern() {
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the rows");
      int a = sc.nextInt();

      for(int i = 1; i <= a; ++i) {
         for(int j = 1; j <= i; ++j) {
            System.out.print("" + j + " ");
         }

         System.out.println();
      }

   }
}
