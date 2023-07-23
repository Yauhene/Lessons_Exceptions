package les_02_22072023.app_6;

import java.io.IOException;
import java.io.PrintWriter;

public class Application_6 {
    //За счёт throws в методе
    //createReport() мы не
    //обрабатываем Checked
    //IOException, а пробрасываем
    //его наверх.
    //В данном случае — в метод
    //main().
    public static void main(String[] args) {
        try {
            createReport();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void createReport() throws IOException {
        PrintWriter writer = new PrintWriter("report.txt");
        writer.close();
    }
}
