interface Camera { void takePhoto(); }
interface MusicPlayer { void playMusic(); }

public class Question16 implements Camera, MusicPlayer {
    public void takePhoto() { System.out.println("Photo taken"); }
    public void playMusic() { System.out.println("Music playing"); }

    public static void main(String[] args) {
        Question16 phone = new Question16();
        phone.takePhoto();
        phone.playMusic();
    }
}

