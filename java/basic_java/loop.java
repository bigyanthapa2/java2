package basic_java;
import java.util.Scanner;

public class loop {
 public static void main(String[] args){


     //!by using for loop-------------------------------------------------------------------------------

    // for(int i = 1; i<=100; i++){
    //     System.out.println(i);  
    // }

    // for(int l = 100; l>=1 ; l--){
    //     System.out.println(l);
    // }
    
    //! by using while loop-------------------------------------------------------------------------------

    // int i = 100;
    // while(i>=1){
    //     System.out.println(i); 
    //     i++;      //* from 1 to 100 */
    // }
    //! by using do while loop-----------------------------------------------------------------------------

    // int k = 100;
    // do{
    //     System.out.println(k); //*  from 100 to 1 */
    //     k--;
    // }while(k>=1);

    Scanner sc = new Scanner(System.in);
    int num = 0;

    do{
        System.out.println("Enter a number :");
        num = sc.nextInt();
        System.out.println("Here is your number");
        System.out.println(num);

    }while(num>=0);
    System.out.println("THE END");



 }

}
