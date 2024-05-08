package Chapter3;

public class ifStatement {
    public static void main(String[] args) {
        int hourOfDay= 9;
        int morningGreetCount = 1;
        if(hourOfDay<11){
            System.out.println("Good Morning");
            morningGreetCount++;
        }

        System.out.println(morningGreetCount);
    }
    
}
