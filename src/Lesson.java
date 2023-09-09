public class Lesson {
    public static int id;
    private int instanceId;
    private String name;

    private String description;

    public Lesson(String name, String description) {
        this.name = name;
        this.description = description;
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
        Lesson.id = id;
    }

    public int getInstanceId() {
        return instanceId;
    }



    @Override
    public String toString() {
        return "Lesson{" +
                "instanceId=" + instanceId +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}



