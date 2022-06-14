package Lesson8Nasledovanie;

public class Student {
    String firstName, lastName, group;
    double mark;
    int stepa;

    public Student(String firstName, String lastName, String group, double mark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.mark = mark;
    }

    public int getStepa() {
        if (mark == 5) {                   // можно записать кратко mark==5 ? 100 : 80;
            stepa = 100;
        } else {
            stepa = 80;
        }
        return stepa;
    }
}