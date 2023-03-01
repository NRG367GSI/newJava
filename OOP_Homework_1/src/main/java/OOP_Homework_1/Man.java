package OOP_Homework_1;


import java.util.ArrayList;

public class Man extends Individual{
    final String floor = "Мужчина";
    private String id;

    private Status status;

    enum Status {
        ancestor, individual, descendant;
    }

    private static int count;

    static {
        count = 0;
    }

    private static int setCount() {
        return count++;
    }

    public Man(String surname, String name, String birthday, Status status) {
        super(surname, name, birthday);
        this.id = getId();
        this.status = status;

    }

    @Override
    public String toString() {
        return String.format("id: %s \n %s \n Пол: %s \n Статус: %s \n", getId(), super.toString(), floor, status);
    }


    private String getId() {
        return String.format("%s%d", this.getClass().getSimpleName().charAt(0), setCount());
    }

}
