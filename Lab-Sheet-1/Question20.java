import java.util.Scanner;

public class Question20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        System.out.print("Enter gender (M/F): ");
        char gender = sc.next().charAt(0);

        if(gender == 'M' || gender == 'm') { // male case
            if(age >= 21)
                System.out.println("Eligible for marriage");
            else
                System.out.println("Not eligible");
        } else if(gender == 'F' || gender == 'f') { // female case
            if(age >= 18)
                System.out.println("Eligible for marriage");
            else
                System.out.println("Not eligible");
        } else {
            System.out.println("Invalid gender input");
        }
    }
}

