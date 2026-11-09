import java.util.Scanner;

public class Question04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = {10,20,30,40,50};

        try {

            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());

            System.out.println(a / b);

            int index = sc.nextInt();

            System.out.println(arr[index]);
        }

        catch(ArithmeticException e){
            System.out.println("Division Error");
        }

        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Index");
        }

        catch(NumberFormatException e){
            System.out.println("Invalid Number");
        }
    }
}