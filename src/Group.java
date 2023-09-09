import java.util.List;

public class Group {
    public static int id;
    private int instanceId;
    private String name;
    private String description;

    private List<Student> students;
    private List<Lesson> lessons;





    public Group(String name, String description, List<Student>students, List<Lesson> lessons) {
        this.instanceId=id++;
        this.name = name;
        this.description=description;
        this.students=null;
        this.lessons=null;



    }


    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Group.id = id;
    }

    public int getInstanceId() {
        return instanceId;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    @Override
    public String toString() {
        return "Group{" +
                "instanceId=" + instanceId +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}







