import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter ypour age: ");
        int age=s.nextInt();
        if(age>18){
            System.out.println("can drive");
        }
        else if(age==18){
            System.out.println("can drive after 18+");
        }
        else{
            System.out.println("can not drive");
        }
    }
}
