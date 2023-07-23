package les_02_22072023.app_1;

import java.io.File;

public class Application {
    public static void main(String[] args) {
        Object object = new String("123");
        File file = (File) object;
        //String name = null;
//        System.out.println(name.length());
        System.out.println(file);
    }
}
