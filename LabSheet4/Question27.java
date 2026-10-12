public class Question27 {
    static int totalReversals = 0;

    void reverse(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        totalReversals++;
        System.out.println("Original: " + str + ", Reversed: " + rev);
    }

    public static void main(String[] args) {
        Question27 sr = new Question27();
        sr.reverse("Janvi");
        sr.reverse("COER");
        System.out.println("Total reversals = " + totalReversals);
    }
}

