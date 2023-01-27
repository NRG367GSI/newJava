package Homework_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Task_2 {

    public static void ExpDir() {
        try {
            String pathProperty = System.getProperty("user.dir");
            String fileSep = System.getProperty("file.separator");
            String pathFile = (pathProperty + fileSep).concat("TEST.txt");
            File fileTest = new File(pathFile);
            System.out.println(pathFile);
            //System.out.println("\n" + fileTest.getAbsolutePath());
            if (fileTest.createNewFile()) {
                System.out.println("Файл создан! \n");
            } else {
                System.out.println("Файл не создан! \n");
            }
        } catch (Exception e) {
            System.out.println("Вызвана ошибка: " + e);
        } finally {
            System.out.println("finally");
        }
    }

    public static void writeFile(String text) throws FileNotFoundException {
        try (PrintWriter writer = new PrintWriter("temp.txt")) {
            writer.write(text);
            System.out.println("Запись прошла успешно!");
        }catch (Exception e) {
            System.out.printf("Произошла ошибка: %t", e);
        }
    }

    public static String strTEST() {
        String str100 = null;
        String str = "TEST";
        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            newStr.append(str);
        }
        str100 = newStr.toString();
        System.out.println("Строка создана!");
        return str100;
    }

    public static void controller() {
        try {
            writeFile(strTEST());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
