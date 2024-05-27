package basic_java;

public class casting {
//     public static void main(String[] args) {
//         double myDouble = 20.192;
//         int myInt = (int) myDouble;

    
//     System.out.println(myDouble);//output 20.192
//     System.out.println(myInt); //output 20

// }
// }




//* Set the maximum possible score in the game to 500 and Calculate the percantage of the user's score in relation 
//* to the maximum available score.Convert userScore to float to make sure that the division is accurate

  public static void main(String[] args) {
    int maxScore = 500;
    int userScore = 478;
    float percentage = (float) userScore/maxScore * 100.0f;
    System.out.println("User percentage is :" +percentage);
  }


}
