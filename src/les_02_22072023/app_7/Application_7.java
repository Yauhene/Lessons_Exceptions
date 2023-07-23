package les_02_22072023.app_7;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application_7 {
    public static void main(String[] args) {
        FileReader test = null;
        try {
            test = new FileReader("src\\les_02_22072023\\app_7\\test");
            test.read();
        } catch (RuntimeException | IOException e) {
            System.out.println("catch exception: " + e.getClass().getSimpleName());
        } finally {
            System.out.println("finally start ------------------------");
            if (test != null) {
                try {
                    test.close();

                } catch (IOException e) {
                    System.out.println("exception while close");
                }
            }
            System.out.println("finally finised ------------------------");
        }
    }
}
