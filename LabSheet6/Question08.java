public class Question08 {

    public static void main(String[] args) {

        try {

            int a = 10;
            int b = 0;

            try {
                int arr[] = {1,2,3};
                System.out.println(arr[5]);
            }

            catch(ArrayIndexOutOfBoundsException e) {
                System.out.println("Array Error");
            }

            System.out.println(a/b);
        }

        catch(ArithmeticException e) {
            System.out.println("Division Error");
        }
    }
}