import java.util.ArrayList;
import java.util.List;

public class DataBase {

    private List<Group> groups;


    private List<Student> students;

    private List<Lesson> lesson;



    public DataBase() {
        this.groups = new ArrayList<>();
        this.students = new ArrayList<>();
        this.lesson = new ArrayList<>();


    }


    public List<Lesson> getLesson() {
        return lesson;
    }

    public void setLesson(List<Lesson> lesson) {
        this.lesson = lesson;
    }

    public List<Group> getGroups() {
        return groups;
    }



    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}






