Qinterface Sports {
    void play();
}

class Cricket implements Sports {
    public void play() { System.out.println("Playing Cricket"); }
}

class Football implements Sports {
    public void play() { System.out.println("Playing Football"); }
}

public class Question26 {
    public static void main(String[] args) {
        Sports s1 = new Cricket();
        Sports s2 = new Football();
        s1.play();
        s2.play();
    }
}

