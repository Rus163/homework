public class Main {
    public static void main(String[] args) {
        //1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
        //Конструктор класса должен заполнять эти поля при создании объекта.
        //Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.

        Сотрудник employee = new Сотрудник("Морозов Руслан Николаевич", "Директор", "Boss@gmail.com", "+7(777)7777777", "7777777$", "31");
        employee.displayInfo();

        //2. Создать массив из 5 сотрудников.
        //Пример:
        //// вначале объявляем массив объектов
        //Person[] persArray = new Person[5];
        //// потом для каждой ячейки массива задаем объект
        //persArray[0] = new Person("Ivanov Ivan", "Engineer",
        //               "ivivan@mailbox.com", "892312312", 30000, 30);
        //persArray[1] = new Person(...);
        //...
        //persArray[4] = new Person(...);

        Employee[] employeesArray = new Employee[5];
        employeesArray[0] = new Employee("Иванов Иван Иванович", "Дворник", "x@example.com", "123123123", "999999", "30");
        employeesArray[1] = new Employee("Василий Васильев Васильевич", "Слесарь", "xx@example.com", "234234234", "40000", "25");
        employeesArray[2] = new Employee("Александр Александров Александрович", "Депутат", "xxx@example.com", "345345345", "60000", "35");
        employeesArray[3] = new Employee("Петя Петров Петрович", "Учитель", "xxxx@example.com", "456456456", "45000", "28");
        employeesArray[4] = new Employee("Олег Олегов Олегович", "Монтажник", "xxxxx@example.com", "567567567", "55000", "32");

        for (Employee employee1 : employeesArray) {
            employee1.displayInfo();
            System.out.println();
        }

        //3. Создать класс Park с внутренним классом, с помощью объектов которого можно хранить информацию об аттракционах, времени их работы и стоимости.

        Park myPark = new Park("Wonderland");
        Park.Attraction rollerCoaster = myPark.new Attraction("Room Deads", "10:00 ", "18:00 ", 100.00);
        rollerCoaster.displayAttractionInfo();
    }

}








