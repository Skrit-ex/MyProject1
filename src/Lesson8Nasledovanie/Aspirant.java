package Lesson8Nasledovanie;

public class Aspirant extends Student {

    String work;

    public Aspirant(String firstName, String lastName, String group, double mark, String work) {
        super(firstName, lastName, group, mark);
        this.work = work;
    }

    @Override
    public int getStepa() {
        return mark==5 ? 200 : 180;
    }

    public static void main(String[] args) {
        Student student = new Student("Ivan", "Karpov", "124 A", 4.5);
        Aspirant aspirant1 = new Aspirant("Niko", "Zwenko", "12 B", 5, "Bat");

            Student aspirant2 = new Aspirant("Alex", "Duber", "12", 4,"Attention");

        Student[] students = {student,aspirant1,aspirant2};
        for (Student s: students){
            System.out.println(s.getStepa());
        }
    }
}
