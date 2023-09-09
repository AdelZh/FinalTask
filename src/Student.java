public class Student {
    public static int id;
    private int instanceId;
    private String name;
    private String fullName;
    private String email;

    private int password;
    private Gender gender;

    public Student(String name, String fullName, String email, int password, Gender gender) {
        this.name = name;
        this.fullName = fullName;
        this.email = email;
        this.password=password;
        this.gender = gender;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }





    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Student.id = id;
    }

    public int getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(int instanceId) {
        this.instanceId = instanceId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "instanceId=" + instanceId +
                ", name='" + name + '\'' +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                '}';
    }
}






