public class Question14 {
    String name;
    int age;
    static String country = "India";

    Question14(String n, int a) {
        name = n;
        age = a;
    }

    void checkVoting() {
        if (age >= 18) {
            System.out.println(name + " is eligible to vote in " + country);
        } else {
            System.out.println(name + " is NOT eligible to vote in " + country);
        }
    }

    public static void main(String[] args) {
        Question14 p1 = new Question14("Janvi", 19);
        Question14 p2 = new Question14("Rahul", 16);
        p1.checkVoting();
        p2.checkVoting();
    }
}

