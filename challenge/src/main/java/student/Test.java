package student;

public class Test {
    public static void main(String[] args) {
        Major major2= new Major("25", "French");
        Student student1= new Student("Abid", "Aya", "0689360444", "aya.abid@um6p.ma","cd948494" );
        Student student2= new Student("assali", "malak", "0689360434", "malak.assali@um6p.ma","cd558494", major2);
        Student student3= new Student("Berrada", "Amir", "0667676767", "amir.berrada@um6p.ma", "cd123231");



        // Display computer science students
        Student.computerScience.displayStudents();

        System.out.println("\nFormatted names:");
        System.out.println(student1.getFullNameFormatted());
        System.out.println(student2.getFullNameFormatted());
        System.out.println(student3.getFullNameFormatted());

        System.out.println("\nComputer science students: " + Student.computerScience.getStudentCount());
        System.out.println("French students: " + major2.getStudentCount());

        System.out.println("\nOccupancy rate: " + Student.computerScience.getOccupancyRate() + "%");

        System.out.println("\nList as string:");
        System.out.print(Student.computerScience.getStudentListAsString());

        System.out.println("\nRemove cd948494: " + Student.computerScience.removeStudent("cd948494"));
        System.out.println("Remove zzz: " + Student.computerScience.removeStudent("zzz"));

        System.out.println("\nAfter removal:");
        System.out.print(Student.computerScience.getStudentListAsString());
        System.out.println("Computer science students: " + Student.computerScience.getStudentCount());
    }
}

