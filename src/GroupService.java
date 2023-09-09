public  interface GroupService {

    void addNewGroup(Group groupName);
    void GetGroupByName( String name);
    void UpdateGroupName(int id, String name);
    void getAllGroup();

}
