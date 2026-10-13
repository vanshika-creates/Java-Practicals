interface Printer { void print(); }
interface Scanner { void scan(); }

public class Question17 implements Printer, Scanner {
    private String machineName; private int;

    public void setMachine(String n, int id) { machineName = n; machineId = id; }
    public void print() { System.out.println(machineName + " prints"); }
    public void scan() { System.out.println(machineName + " scans"); }

    public static void main(String[] args) {
        Question17 m = new Question17();
        m.setMachine("Xerox", 101);
        m.print(); m.scan();
    }
}

