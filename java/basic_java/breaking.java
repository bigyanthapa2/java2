package basic_java;

public class breaking {
    public static void main(String[] args) {
        int i = 0;
        while(true){
            while (i ==3) {
                i = i + 1;
                continue;
            }
            System.out.println(i);
            i = i + 1;
            if(i > 5){
            break;
            }
        }

    }

}
    
