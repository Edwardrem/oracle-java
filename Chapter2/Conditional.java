package Chapter2;

public class Conditional {
    public static void main(String[] args) {
        int hour = 10;
        boolean zooOpen  = true || (hour < 4);
        System.out.println(zooOpen);
    }
}
