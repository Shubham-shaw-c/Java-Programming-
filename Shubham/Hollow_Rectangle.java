// Source code is decompiled from a .class file using FernFlower decompiler.
package Shubham;

import java.util.Scanner;

public class Hollow_Rectangle {
   public Hollow_Rectangle() {
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the Row");
      int a = sc.nextInt();
      Scanner sc1 = new Scanner(System.in);
      System.out.println("enter the Column");
      int b = sc1.nextInt();

      for(int i = 1; i <= a; ++i) {
         for(int j = 1; j <= b; ++j) {
            if (i != 1 && j != 1 && i != a && j != b) {
               System.out.print(" ");
            } else {
               System.out.print("*");
            }
         }

         System.out.println();
      }

   }
}
