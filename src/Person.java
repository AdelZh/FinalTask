public class Person {
    public static int id;
    private  int instanceId;
    private String name;
    private String lastName;

    private String email;
    private String password;


    public Person( String name, String lastName, String email, String password) {
        this.instanceId = id++;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Person.id = id;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public String getEmail() {
        return email;
    }



    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "instanceId=" + instanceId +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password=" + password +
                '}';
    }
}



