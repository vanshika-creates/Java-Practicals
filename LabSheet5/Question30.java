interface Researcher { void research(); }

class Teacher {
    String subject;
    Teacher(String sub) { subject = sub; }
    void teach() { System.out.println("Teaching " + subject); }
}

class ResearchTeacher extends Teacher implements Researcher {
    ResearchTeacher(String sub) { super(sub); }
    public void research() { System.out.println("Researching in " + subject); }
}

public class Question30 {
    public static void main(String[] args) {
        ResearchTeacher rt = new ResearchTeacher("Computer Science");
        rt.teach();
        rt.research();
    }
}
