package les_02_22072023.app_5;

public class Application_5 {

    /**
     * первым и единственным выскочит исключение, полученное первым
     * @param args
     */
    public static void main(String[] args) {
        int number = 1;
        try {
            number = 10 / 0;
            String test = null;
            System.out.println(test);
        } catch (ArithmeticException e) {
            System.out.println("operation divide by zero not supported ");
        } catch (NullPointerException e) {
            System.out.println("nullpointer exception " + e);
        }
        System.out.println(number);
    }
}
