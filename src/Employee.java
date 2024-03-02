public class Employee {
    private String ФИО;
    private String должность;
    private String email;
    private String Тедефон;
    private String Зарплата;
    private String Возраст;

    public Employee(String ФИО, String должность, String email, String Тедефон, String Зарплата, String Возраст) {
        this.ФИО = ФИО;
        this.должность = должность;
        this.email = email;
        this.Тедефон = Тедефон;
        this.Зарплата = Зарплата;
        this.Возраст = Возраст;
    }

    public void displayInfo() {
        System.out.println("ФИО: " + ФИО);
        System.out.println("должность: " + должность);
        System.out.println("email: " + email);
        System.out.println("Тедефон: " + Тедефон);
        System.out.println("Зарплата: " + Зарплата);
        System.out.println("Возраст: " + Возраст + '\n');
    }
}
