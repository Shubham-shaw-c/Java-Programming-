// Source code is decompiled from a .class file using FernFlower decompiler.
package Shubham;

import java.util.Scanner;

public class Half_primaid_or_Rightangle_triangle {
   public Half_primaid_or_Rightangle_triangle() {
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the Row");
      int a = sc.nextInt();

      for(int i = 1; i <= a; ++i) {
         for(int j = i + 1; j <= a + 1; ++j) {
            System.out.print("*");
         }

         System.out.println();
      }

   }
}
