// Source code is decompiled from a .class file using FernFlower decompiler.
package Shubham;

import java.util.Scanner;

public class Number_pattern3 {
   public Number_pattern3() {
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the rows");
      int a = sc.nextInt();

      for(int i = 1; i <= a; ++i) {
         for(int j = 1; j <= i; ++j) {
            if ((i + j) % 2 == 0) {
               System.out.print("1 ");
            } else {
               System.out.print("0 ");
            }
         }

         System.out.println();
      }

   }
}
