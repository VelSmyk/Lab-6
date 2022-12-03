package ad211.smyk;

public class Student implements Person {
    private String name ;// поле
    private String surname;// поле
    private int age;// поле
    private int groupNumber;// поле
    private int studentID;// поле

    public Student(int groupNumber, String surname, String name, int age,  int studentID) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.groupNumber = groupNumber;
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGroupNumber(){
        return groupNumber;
    }
    public int getStudentID(){
        return studentID;
    }

    public void setGroupNumber(int groupNumber){
        this.groupNumber = groupNumber;
    }
    public void setStudentID(int studentID){
        this.studentID = studentID;
    }

    @Override
    public void printInfo(){
        System.out.println("Student of group " + groupNumber + " " + surname + " " + name + ", age: " + age + "\nNumber of student ID: " + studentID);
    }

}
