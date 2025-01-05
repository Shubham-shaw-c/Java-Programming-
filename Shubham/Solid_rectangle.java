// Source code is decompiled from a .class file using FernFlower decompiler.
package Shubham;

import java.util.Scanner;

public class Solid_rectangle {
   public Solid_rectangle() {
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the Row");
      int a = sc.nextInt();
      Scanner sc1 = new Scanner(System.in);
      System.out.println("enter the Column");
      int b = sc1.nextInt();

      for(int i = 0; i < a; ++i) {
         for(int j = 0; j < b; ++j) {
            System.out.print("*");
         }

         System.out.println();
      }

   }
}
