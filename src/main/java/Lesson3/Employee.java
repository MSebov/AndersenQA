package Lesson3;

public class Employee {
    //1.    Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
    private String name;
    private String position;
    private String mail;
    private int phoneNumber;
    private int salary;
    private int age;

    //2.   Конструктор класса должен заполнять эти поля при создании объекта.
    public Employee(String name, String position, String mail, int phoneNumber, int salary, int age) {
        this.name = name;
        this.position = position;
        this.mail = mail;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    // 3.Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
    public void information() {
        System.out.println("Name: " + this.name +
                " Position: " + this.position +
                " Mail: " + this.mail +
                " Phone number: " + this.phoneNumber +
                " Salary: " + this.salary +
                " Age: " + this.age);
    }

    // создаем метод валидации (по возрасту)
    public void printInformationIfAgeMoreThan(int age) {
        if (this.age > age) this.information();
    }

}
