package Yang;

public abstract class Person {
    private String firstName;
    private String lastName;
    private String email;

    public Person() {
        firstName = "";
        lastName = "";
        email = "";
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(firstName) {
        this.firstName =  firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(lastName) {
        this.lastName =  lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(email) {
        this.email =  email;
    }

    @Override
    public String toString() {
        return "Name: " + firstName + lastName + "\n" + "Email: " + email;
    }

    public abstract String getDisplayText();

}
