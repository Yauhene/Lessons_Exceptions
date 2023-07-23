package les_02_22072023.app_4;

public class Application_4 {
    public static void main(String[] args) {
        try {
            int number = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("operation divide by zero not supported");
        }
    }
}
