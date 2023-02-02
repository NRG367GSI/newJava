package Homework_4;

import java.util.*;

/*
1. Реализовать консольное приложение, которое:
Принимает от пользователя и “запоминает” строки.
Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
Если введено revert, удаляет предыдущую введенную строку из памяти.

2. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
 */
public class DataStorageAndProcessing {

    public static Deque<String> sequence = new ArrayDeque<>();






    public  static void menu() {
        Scanner scan = new Scanner(System.in);
        String[] list = {"print", "revert", "add", "exit"};
        ArrayList<String> arrayList = new ArrayList<String>(List.of(list));

        String args = null;
        while (arrayList.lastIndexOf(args) == -1) {
            System.out.println("Make a request, pleas: ");
            args = scan.next().toLowerCase();
            switch (args) {
                case "print": System.out.println("print");
                    break;
                case "revert": System.out.println("revert");
                    break;
                case "add":
                    DataStorageAndProcessing exp = new DataStorageAndProcessing();
                    exp.sequence = addStr(sequence);
                    exp.sequence = addStr(sequence);
                    break;
                case "exit": System.exit(0);
                    break;
                //default:
                    //throw new IllegalStateException("Unexpected value: " + args);
            }


        }


    }

    public static Deque<String> addStr(Deque<String> seq) {
        Scanner scan = new Scanner(System.in);


        //List<String> strings = new ArrayList<>(List.of(seq));
        //Deque<String> addArr = (Deque<String>) seq;

        String str = scan.next();
        if (seq.offerLast(str)) {
            System.out.println("Выражение успешно добавлен!" + str);
            //sequence = (ArrayList<String>) addArr;
        } else {
            System.out.println("Выражение не добавлен!");
        }

        return seq;
    }

}
