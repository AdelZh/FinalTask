public interface LessonService {
    Lesson addNewLessonToGroup(String name, Lesson lesson);
    void getAllStudentLesson(String name);

    void getLessonByName(String name);
    void getAllLessonByGroupName(String name);
    void deleteLesson(int id);

}
