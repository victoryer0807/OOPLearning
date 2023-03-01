package constructorTest;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Fraction fraction = new Fraction(1, 10);

        Person Oleg = new Person("Konin","Oleg",'m');
        System.out.println(Oleg);
    Employee olga = new Employee("Svetova","Olga",'f',"buhgalter");
    /*olga.setFirstName("Olga");
    olga.setLastName("Svetova");
    olga.setGender('f');*/


        System.out.println(olga);

        Person olga2 = olga;
        System.out.println(olga2);
    }
}
/*

class Person {
    private String name;
    private int age;


    public Person(String name, int age, String address, String phone) {
        this.name = name;
        this.age = age;


    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0 && age < 110)
            this.age = age;
    }
}
*/

class Fraction {
    int numerator;
    int denominator = 1;

    public Fraction(int numerator, int denominator) { //это конструктор
        if (denominator == 0) {
            System.out.println("can't be zero");
            return;
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }
}

class Person {
    protected String firstName;
    protected String lastName;
    protected char gender;//m-male; f - female

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                '}';
    }

    public Person(){
        this("", "", '-');
    }
    public Person(String lastName){
        this(lastName,"",'-');
    }



    public Person(String lastName, String firstName, char gender){
        this(lastName, firstName);
        this.gender = gender;
    }
public Person(String lastName, String firstName){
        this.firstName = firstName;
        this.lastName = lastName;
}

}
class Employee extends Person{
    protected String dolznost;

    public Employee(String dolznost) {

        this.dolznost = dolznost;
    }

    public Employee(String lastName, String firstName, char gender, String dolznost) {
        super(lastName, firstName, gender);
        this.dolznost = dolznost;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "dolznost='" + dolznost + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                '}';
    }
}