package Shubham;

import java.util.Scanner;
public class Addition_function {
    public static int Addition(int a,int b){
         int c=a+b;
        return c;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int a=sc.nextInt();

        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter second number");
        int b=sc1.nextInt();

        int c=Addition(a,b);
        System.out.println("Number is :" + c);
    }
}
