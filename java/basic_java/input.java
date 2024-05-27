package basic_java;

import java.util.Scanner;

public class input {
    public static void main(String[] args) {
    //how to take input 
    Scanner sc = new Scanner(System.in);
    // System.out.println("enter your age : ");
    // int age = sc.nextInt();                    //OR float age = sc.nextfloat();//*to get the float     
    // System.out.println(age);                                                  //*  value 
    
    System.out.println("Enter you name :  ");
    String name = sc.nextLine();
    System.out.println(name + "Thapa");
    sc.close();
}
}
