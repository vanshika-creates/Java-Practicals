import java.util.ArrayList;
import java.util.Scanner;

public class Question11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        for(int i=1;i<=10;i++) {
            list.add(i);
        }

        System.out.print("Enter Number : ");
        int num = sc.nextInt();

        if(list.contains(num))
            System.out.println("Number Found");
        else
            System.out.println("Number Not Found");
    }
}
