package pnlong.example.pojos;

public class Student {
    private String id;
    private String firstname;
    private String lastname;
    private int marks;
    public Student(String john, String doe, int i){
    }
    public Student(String id, String firstname, String lastname, int marks) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.marks = marks;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}
