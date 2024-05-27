package basic_java;

public class inner {
    static class student {
        int id_no;
        String name;
        int salary;
        static String college = "ITS";
        student(int r,String n,int sal){
        id_no = r;
        name = n;
        salary = sal;
    
    
    }
    void display(){System.out.println(id_no+" "+name+" "+salary+" " +college);}
    
        
    }
    
    public static class Innerstudent {
        public static void main(String[] args) {
            student s1 = new student(12,"Bigyan", 200000);
            student s2 = new student(24,"Rupesh", 150000);
            s1.display();
            s2.display();
    
            
        }
    }
        
    
    
}
