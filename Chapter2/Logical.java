package Chapter2;

public class Logical {
    public static void main(String[] args) {
        boolean eyesClosed = true;
        boolean breathingSlowly = true;

        boolean resting = eyesClosed | breathingSlowly;
        boolean asleep = eyesClosed & breathingSlowly;
        boolean awake = eyesClosed ^ breathingSlowly;

        System.out.println(resting);
        System.out.println(asleep);
        System.out.println(awake);
    }
    
}
