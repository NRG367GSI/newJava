package OOP_Homework_1;

public class Individual {

    private String surname;
    private String name;
    private String birthday;

    public Individual(String surname, String name, String birthday) {
        this.surname = surname;
        this.name = name;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return String.format("Фамилия: %s \n Имя: %s \n Родился: %s", surname, name, birthday);
    }
}
