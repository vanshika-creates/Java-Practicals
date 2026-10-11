import java.until.Scanner;

public class Question1 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];

        System.out.print(class="str">"Enter 5 integers:");
        for (int i = 0; i <a.length; i++){
            a[i] = sc.nextInt();
        }

        System.out.print(class="str">"Array elements:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + class="str">" ");
        }
        sc.close();

    
}
