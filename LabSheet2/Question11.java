import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter theory marks (%): ");
        int theory = sc.nextInt();
        System.out.print("Enter practical marks (%): ");
        int practical = sc.nextInt();

        int overall = (theory + practical) / 2;

        if((theory >= 40 && practical >= 50) || overall >= 50)
            System.out.println("Pass");
        else
            System.out.println("Fail");
    }
}

