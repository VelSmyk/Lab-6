package ad211.smyk;

public class Lecturer implements Person {
   private String nameOfChair;
   private String surname;
   private String name;
   private int age;
   private int salary;

    public Lecturer(String nameOfChair, String surname, String name, int age, int salary) {
        this.nameOfChair = nameOfChair;
        this.surname = surname;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getNameOfChair() {
        return nameOfChair;
    }

    public void setNameOfChair(String nameOfChair) {
        this.nameOfChair = nameOfChair;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public void printInfo() {
        System.out.println("Lecturer of chair of " + nameOfChair + " " + surname + " " + name + ", age: " + age + "\nSalary: " + salary);
    }
}
