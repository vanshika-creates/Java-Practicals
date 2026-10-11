import java.util.Scanner;

public class Question27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Cost Price: ");
        int cp = sc.nextInt();
        System.out.print("Enter Selling Price: ");
        int sp = sc.nextInt();

        if(sp > cp) {
            System.out.println("Profit = " + (sp - cp));
        } else if(cp > sp) {
            System.out.println("Loss = " + (cp - sp));
        } else {
            System.out.println("No Profit No Loss");
        }
    }
}

