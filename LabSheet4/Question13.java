public class Question13 {
    double celsius;
    static String scale = "Celsius";

    Question13(double c) {
        celsius = c;
    }

    void convert() {
        double fahrenheit = (celsius * 9/5) + 32; // local variable
        double kelvin = celsius + 273.15;
        System.out.println("Temp in " + scale + " = " + celsius);
        System.out.println("Fahrenheit = " + fahrenheit);
        System.out.println("Kelvin = " + kelvin);
    }

    public static void main(String[] args) {
        Question13 t1 = new Question13(25);
        t1.convert();
    }
}

