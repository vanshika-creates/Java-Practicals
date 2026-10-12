public class Question22 {
    static int totalChecks = 0;

    void checkArmstrong(int num) {
        int original = num;
        int sum = 0;
        int temp = num;

        while (temp > 0) {
            int digit = temp % 10;
            sum += digit * digit * digit;
            temp /= 10;
        }

        totalChecks++;
        if (sum == original)
            System.out.println(original + " is Armstrong");
        else
            System.out.println(original + " is NOT Armstrong");
    }

    public static void main(String[] args) {
        Question22 a = new Question22();
        a.checkArmstrong(153);
        a.checkArmstrong(123);
        System.out.println("Total checks = " + totalChecks);
    }
}

