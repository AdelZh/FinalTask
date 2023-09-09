import java.util.ArrayList;
import java.util.List;

public class StudentServiceImpl implements StudentService{
    private DataBase dataBase;


    public StudentServiceImpl(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public Student addNewStudent(String name, Student studentName) {
        for (Group gg : dataBase.getGroups()) {
            if (gg.getName().equals(name)) {
                List<Student> newStudent = dataBase.getStudents();
                if (newStudent == null) {
                    newStudent = new ArrayList<>();
                    dataBase.setStudents(newStudent);
                }
                newStudent.add(studentName);
                System.out.println(dataBase.getGroups());
            }
        }
        return studentName;

    }


    @Override
    public void GetAllStudentByGroupName(String name) {
        for (Group gg : dataBase.getGroups()) {
            if (gg.getName().equals(name)) {
                System.out.println(dataBase.getStudents());
            }
        }
    }

    @Override
    public void UpdateStudentName(int id, String name) {
        for (Student ss : dataBase.getStudents()) {
            if (ss.getInstanceId() == id) {
                ss.setName(name);
                System.out.println(ss);
            }
        }
    }

    @Override
    public void getAllStudentLessons() {

    }

    @Override
    public void findStudentByFirstName(String name) {
        for (Student ss : dataBase.getStudents()) {
            if (ss.getName().contains(name)) {
                System.out.println(ss);
            }
        }
    }

    @Override
    public void deleteStudent(String name) {
        for(int i=0; i<dataBase.getStudents().size(); i++){
            if(dataBase.getStudents().get(i).getName().equals(name)){
                Student removedStudent=dataBase.getStudents().remove(i);
                dataBase.getStudents().remove(removedStudent);

                System.out.println(dataBase.getStudents());
                System.out.println("Student deleted");
                break;
            }else {
                System.out.println("This student does not exist");
            }
        }
    }
}
