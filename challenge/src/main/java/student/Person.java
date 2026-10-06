package student;

public class Person {
    private static int nextId = 1;
    protected int id;
    protected String firstName;
    protected String lastName;
    protected String phone;
    protected String email;
    //these fields are protected so they can be accessed without needing any setters or getters.

    public Person(){
        this.id=nextId++;
        this.firstName = "";
        this.lastName = "";
        this.phone = "";
        this.email = "";

    }

    public Person(String lastName, String firstName, String telephone, String email) {
        this.id = nextId++;
        this.firstName = firstName;
        this.lastName= lastName;
        this.phone= telephone;
        this.email= email;
    }
    public String toString(){
        return "Person{id="+id+" firstName="+firstName+" lastName="+lastName+" phone="+ phone+" email= "+email+"}";

    }

}

