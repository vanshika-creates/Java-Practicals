public class Question28 {
    static String language = "English";

    void countWords(String sentence) {
        String[] words = sentence.split(" ");
        int count = words.length;
        System.out.println("Sentence: \"" + sentence + "\"");
        System.out.println("Word Count = " + count + ", Language = " + language);
    }

    public static void main(String[] args) {
        Question28 wc = new Question28();
        wc.countWords("Java is very powerful");
    }
}

