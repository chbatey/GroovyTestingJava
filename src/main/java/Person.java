public class Person {
    private String fname;
    private String lname;

    public Person(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
    }

    public String getFullName() {
        return this.fname + " " + this.lname;
    }

}
