import java.util.List;

public class GroupServiceImpl implements GroupService{
    private DataBase dataBase;



    public GroupServiceImpl(DataBase dataBase) {
        this.dataBase = dataBase;
    }


    public GroupServiceImpl() {

    }


    @Override
    public void addNewGroup(Group group) {
        List<Group> newGroup=(dataBase.getGroups());
        newGroup.add(group);
        System.out.println(newGroup);

        System.out.println("Group succesfully added");


    }


    @Override
    public void GetGroupByName( String name) {
        for(Group gg:dataBase.getGroups()){
            if(gg.getName().contains(name)){
                System.out.println(gg);
            }
        }
    }

    @Override
    public void UpdateGroupName(int id, String name) {
        for(Group gg:dataBase.getGroups()){
            if(gg.getInstanceId()==id){
                gg.setName(name);
                System.out.println(gg);

            }
        }
    }

    @Override
    public void getAllGroup() {
        for(Group gg:dataBase.getGroups()){
            System.out.println(gg);
        }

    }


    @Override
    public String toString() {
        return "GroupServiceImpl{" +
                "dataBase=" + dataBase +
                '}';
    }
}





