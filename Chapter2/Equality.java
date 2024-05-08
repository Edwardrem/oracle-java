package Chapter2;

public class Equality {
    public static void main(String[] args) {
        boolean bear = false;
        boolean polar = (bear = true);
        System.out.println(polar);

        System.out.print(null == null);
    }
    
}
