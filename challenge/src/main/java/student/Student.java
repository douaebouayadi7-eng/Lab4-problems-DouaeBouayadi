package student;

import java.util.Locale;

public class Student extends Person {
    private String cne;
    private Major major;
    public Student() {
        super();
        this.cne = "";
        this.major = null;
    }
    public Student(String nom, String prenom, String telephone, String email, String cne, Major major) {
       super(prenom, nom, telephone, email);
       this.cne= cne;
       this.major= major;
       if (major != null) major.addStudent(this);

    }
    //The default major is computer science, so we will create it.
    public static Major computerScience= new Major("23", "computer science");
    public Student(String nom, String prenom, String telephone, String email, String cne) {
        super(nom, prenom, telephone, email);
        this.major=computerScience ;
        this.cne=cne;
        if (major != null) major.addStudent(this);
    }

//    // Getters
    public String getCne(){ return cne;}
    public Major getMajor(){return major;}



//    // Setters
    public void setCne(String cne){this.cne= cne;}
    public void setMajor(Major major){this.major= major;}


    //toString method
    public String toString(){
        return super.toString()+" Student {cne= "+ cne+" major="+(major==null?"none": major.getCode())+"}";
    }
    public String getFullNameFormatted(){
        return String.format("%s, %s",lastName.toUpperCase(), firstName.substring(0,1).toUpperCase());
    }


}

