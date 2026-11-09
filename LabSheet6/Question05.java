import java.util.Scanner;

public class Question05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println(a / b);
        }

        catch(Exception e){
            System.out.println("Exception Occurred");
        }

        finally{
            System.out.println("Program execution completed");
        }
    }
}