import java.util.Scanner;

public class Question21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int i = 1;

        do {
            if(num % i == 0)
                System.out.println(i);
            i++;
        } while(i <= num);
    }
}

