public interface StudentService {
    Student addNewStudent(String name, Student studentName);

    void GetAllStudentByGroupName(String name);

    void UpdateStudentName(int id, String name);

    void getAllStudentLessons();

    void findStudentByFirstName(String name);

    void deleteStudent(String name);
}