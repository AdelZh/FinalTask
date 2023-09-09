import java.util.ArrayList;
import java.util.List;

public class LessonServiceImpl implements LessonService{
    private DataBase dataBase;

    public LessonServiceImpl(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public Lesson addNewLessonToGroup(String name, Lesson lesson) {
        for(Group gg:dataBase.getGroups()){
            if(gg.getName().equals(name)){
                List<Lesson> myLesson=dataBase.getLesson();
                if(myLesson==null){
                    myLesson=new ArrayList<>();
                    dataBase.setLesson(myLesson);
                }
                myLesson.add(lesson);
                System.out.println(dataBase.getGroups());
            }
        }
        return lesson;
    }


    @Override
    public void getAllStudentLesson(String name) {
        for(Student ss:dataBase.getStudents()){
            if(ss.getName().equals(name)){
                System.out.println(dataBase.getLesson());
            }
        }
    }

    @Override
    public void getLessonByName(String name) {
        for(Lesson ll:dataBase.getLesson()){
            if(ll.getName().contains(name)){
                System.out.println(ll);
            }
        }
    }

    @Override
    public void getAllLessonByGroupName(String name) {
        for(Group gg:dataBase.getGroups()){
            if(gg.getName().contains(name)){
                System.out.println(dataBase.getLesson());
            }
        }
    }

    @Override
    public void deleteLesson(int id) {
        for(int i=0; i<dataBase.getLesson().size(); i++){
            if(dataBase.getLesson().get(i).getInstanceId()==id){
                Lesson removedLesson=dataBase.getLesson().remove(i);
                dataBase.getLesson().remove(removedLesson);

                System.out.println(dataBase.getLesson());
                System.out.println("Lesson deleted");
                break;
            }else {
                System.out.println("This student does not exist");
            }
        }
    }
}




