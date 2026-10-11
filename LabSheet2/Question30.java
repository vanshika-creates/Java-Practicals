import java.util.Scanner;

public class Question30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        boolean isPowerOf4 = (num > 0) && ((num & (num - 1)) == 0) && ((num & 0x55555555) != 0);
        System.out.println(num + (isPowerOf4 ? " is a Power of 4" : " is NOT a Power of 4"));

        int toggled = num ^ (1 << 2);
        System.out.println("After toggling 3rd bit: " + toggled);

        System.out.println("Multiplication table of " + num + ":");
        for(int i=1; i<=10; i++) {
            int result = num * i;

            if(result % 6 == 0) {
                continue;
            }

            if(result % 48 == 0) {
                System.out.println("Stopped at multiple of 48: " + result);
                break; 
            }

            System.out.println(num + " x " + i + " = " + result);
        }
    }
}

