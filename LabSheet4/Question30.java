public class Question30 {
    int booksAvailable;
    static String libraryName = "Central Library";

    Question30(int b) {
        booksAvailable = b;
    }

    void issueBook() {
        if (booksAvailable > 0) {
            booksAvailable--;
            System.out.println("Book issued. Remaining = " + booksAvailable);
        } else {
            System.out.println("No books available to issue.");
        }
    }

    void returnBook() {
        booksAvailable++;
        System.out.println("Book returned. Total = " + booksAvailable);
    }

    public static void main(String[] args) {
        Question30 lib = new Question30(5);
        lib.issueBook();
        lib.issueBook();
        lib.returnBook();
    }
}

