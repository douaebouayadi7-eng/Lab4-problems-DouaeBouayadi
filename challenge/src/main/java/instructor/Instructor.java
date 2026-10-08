package instructor;

import student.Person;

public class Instructor extends Person {
    private String employeeNumber;
    Instructor(String lastName, String firstName, String telephone, String email, String employeeNumber){
        super(lastName, firstName, telephone, email);
        this.employeeNumber= employeeNumber;
    }
    public String getEmployeeNumber(){
        return employeeNumber;
    }
    public String cleanEmployeeNumber(){
        return String.join("", getEmployeeNumber().trim().split(" "));
    }
    public String summaryLine(){
        return String.format("Instructor[employeeNumber=%s, lastName=%s, firstName=%s]",getEmployeeNumber(), lastName, firstName);
    }
    public String toCard(){
        StringBuilder sb= new StringBuilder();
        sb.append("Instructor\n");
        sb.append("------\n");
        sb.append("Employee#:").append(getEmployeeNumber()).append("\n");
        sb.append("Name      : ").append(lastName).append(", ").append(firstName).append("\n");
        sb.append("Email     : ").append(email).append("\n");
        sb.append("Phone     : ").append(phone).append("\n");
        return sb.toString();
    }
    public String displayName(){
        StringBuilder sb= new StringBuilder();
        if (firstName!=null) sb.append(lastName);
        else{
            sb.append(firstName).append(" ");
            sb.append(lastName);
        }
        return sb.toString();
    }
}
