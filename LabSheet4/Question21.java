public class Question21 {
    static int countChecks = 0;

    void checkPalindrome(int num) {
        int original = num;
        int rev = 0;
        int temp = num;

        while (temp > 0) {
            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp /= 10;
        }

        countChecks++;
        if (original == rev)
            System.out.println(original + " is Palindrome");
        else
            System.out.println(original + " is NOT Palindrome");
    }

    public static void main(String[] args) {
        Question21 p = new Question21();
        p.checkPalindrome(121);
        p.checkPalindrome(123);
        System.out.println("Total checks = " + countChecks);
    }
}

