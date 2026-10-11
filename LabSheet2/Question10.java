import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        System.out.print("Enter start range: ");
        int start = sc.nextInt();
        System.out.print("Enter end range: ");
        int end = sc.nextInt();

        boolean leap = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);

        if(leap && year >= start && year <= end)
            System.out.println(year + " is Leap Year and in range");
        else
            System.out.println("Condition not satisfied");
    }
}

