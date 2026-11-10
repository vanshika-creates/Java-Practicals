public class Question14 {

    public static void main(String[] args) {

        final String resource1 = "A";
        final String resource2 = "B";

        Thread t1 = new Thread() {

            public void run() {

                synchronized(resource1) {

                    System.out.println("Thread1 Locked A");

                    synchronized(resource2) {

                        System.out.println("Thread1 Locked B");
                    }
                }
            }
        };

        Thread t2 = new Thread() {

            public void run() {

                synchronized(resource2) {

                    System.out.println("Thread2 Locked B");

                    synchronized(resource1) {

                        System.out.println("Thread2 Locked A");
                    }
                }
            }
        };

        t1.start();
        t2.start();
    }
}