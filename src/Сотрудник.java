import java.util.Scanner;

public class Сотрудник {

    private String ФИО;
    private String должность;
    private String email;
    private String Тедефон;
    private String Зарплата;
    private String Возраст;

    public Сотрудник(String ФИО, String должность, String email, String тедефон, String зарплата, String возраст) {
        this.ФИО = ФИО;
        this.должность = должность;
        this.email = email;
        this.Тедефон = тедефон;
        this.Зарплата = зарплата;
        this.Возраст = возраст;
    }

    public void displayInfo(){
        System.out.println("ФИО: " + ФИО);
        System.out.println("должность: " + должность);
        System.out.println("email: " + email);
        System.out.println("Тедефон: " + Тедефон);
        System.out.println("Зарплата: " + Зарплата);
        System.out.println("Возраст: " + Возраст + '\n');
    }
}

