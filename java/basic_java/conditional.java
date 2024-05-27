package basic_java;


import java.util.Scanner;
public class conditional {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        int cash = sc.nextInt();

         if(cash<10){
           System.out.println("You cannot buy anything");
              System.out.println("Bring back some more money");
             }

             else if(cash<=40){
              System.out.println("You Can buy a Pen");
             }

              else{
              System.out.println("you can Buy a note book");
             }
   
             } 
             }
 