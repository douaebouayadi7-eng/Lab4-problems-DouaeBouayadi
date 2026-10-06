package student;

public class Major {
    private static int nextId = 1;
    private int id;
    private String code;
    private String name;
    private Student[] students;
    private int studentCount;
    public Major() {
        this.id = nextId++;
        this.code = "";
        this.name = "";
        this.students = new Student[50];
        this.studentCount = 0;
    }
    public Major(String code, String name) {
        this.code= code;
        this.name=name;
        this.id = nextId++;
        this.students = new Student[50];
        this.studentCount = 0;

    }

    // Method to add a student
    public void addStudent(Student s) {
        if (studentCount==50){System.out.println("No syudent can be added to this major");}
        students[studentCount]= s;
        studentCount++;
    }

   // Getters
    public int getId(){ return id;}
    public String getName(){return name;}
    public Student[] getStudents(){return students;}
    public int getStudentCount(){return studentCount;}
    public String getCode(){return code;}

    //Setters
    public void setId(int id){this.id= id;}
    public void setCode(String code){this.code= code;}
    public void setName(String name) { this.name = name; }
    public void setStudents(Student[] students) { this.students = students; }
    public void setStudentCount(int studentCount) { this.studentCount = studentCount; }

    // the toString() method
    public String toString(){
        return "Major{ name= "+name+" code= "+ code+" number of students= "+ studentCount+"id= "+id+"}";
    }



//    // Display all students in the major
//    public void displayStudents() {
//
//    }
//
//
}
