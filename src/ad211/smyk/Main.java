package ad211.smyk;

public class Main {
    public static void main(String[] args){
        Person[] people = new Person[5];
        people[0] = new Student(211,"Smyk", "Valeriya", 19, 11003);
        people[1] = new Student(215,"Soroka", "Viktoriya", 20, 11056);
        people[2] = new Student(191,"Plotnik", "Egor", 21, 10678);
        people[3] = new Lecturer("Information and Technology","Egoshina","Anna",33, 10500);
        people[4] = new Lecturer("Math","Malis","Sergei",45, 14000);
        for(Person person: people){
            printInfo(person);
        }
    }
    public static void printInfo(Person person){
        person.printInfo();
    }
}
