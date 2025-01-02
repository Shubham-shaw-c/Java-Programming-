// Source code is decompiled from a .class file using FernFlower decompiler.
package Shubham;

import java.util.Scanner;

public class if_else {
   public if_else() {
   }
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter first side of the triangle");
      int a = sc.nextInt();
      Scanner sc1 = new Scanner(System.in);
      System.out.println("Enter second side of the triangle");
      int b = sc1.nextInt();
      // new Scanner(System.in);
      System.out.println("Enter third side of the triangle");
      int c = sc1.nextInt();
      if (a >= b && a >= c) {
         if (b >= c) {
            System.out.println("" + a + "A is  greater then B and C");
            System.out.println("" + b + "B is  greater then C");
            System.out.println("" + c + "C is  smallest");
         } else {
            System.out.println("" + a + "A is  greater then B and C");
            System.out.println("" + c + "C is  greater then B");
            System.out.println("" + b + "B is  smallest");
         }
      } else if (b >= a && b >= c) {
         if (a >= c) {
            System.out.println("" + b + "B is  greater then A and C");
            System.out.println("" + a + "A is  greater then C");
            System.out.println("" + c + "C is  smallest");
         } else {
            System.out.println("" + b + "B is  greater then A and C");
            System.out.println("" + c + "C is  greater then C");
            System.out.println("" + a + "A is  smallest");
         }
      } else if (c >= a && c >= b) {
         if (a >= b) {
            System.out.println("" + c + "C is  greater then A and B");
            System.out.println("" + a + "A is  greater then B");
            System.out.println("" + b + "B is  smallest");
         } else {
            System.out.println("" + c + "C is  greater then A and C");
            System.out.println("" + b + "B is  greater then C");
            System.out.println("" + a + "A is  smallest");
         }
      } else {
         System.out.println("All are equal");
      }

   }
}