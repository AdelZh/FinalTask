import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formattedDate = dateFormat.format(currentDate);
        System.out.println("Current Time: " + formattedDate);

        Scanner scanner = new Scanner(System.in);
        System.out.println("-> Choose 1 if you registered");
        System.out.println("-> Choose 2 if you need get registration");
        System.out.println("-> Choose 3 to exit");
        while (true) {
            Person person = new Person("Michelle", "Obama", "adel@gmail.com", "@adel");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("****To get access, please enter your email and password****");
                    System.out.print("Please write email: ");
                    String email = scanner.next();
                    scanner.nextLine();
                    System.out.print("Please write password: ");
                    String password = scanner.nextLine();
                    try {

                        if (!email.equals(person.getEmail()) || !String.valueOf(password).equals(person.getPassword())) {
                            throw new RuntimeException("Invalid email or password format. Please enter correct credentials.");
                        }

                        System.out.println(method22());
                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                        System.out.println("Try again");
                        {
                            System.out.print("Put password: ");
                            String nn = scanner.next();
                            if (nn.equals(person.getPassword()))
                                System.out.println(method22());

                        }


                    }
                case 2:
                    if (choice == 2) {
                        System.out.print("Write name: ");
                        String jj = scanner.next();
                        scanner.nextLine();
                        System.out.print("Write lastName: ");
                        String ss = scanner.next();
                        System.out.print("Write email: ");
                        String yy = scanner.nextLine();
                        scanner.nextLine();
                        System.out.print("Write password: ");
                        String kk = scanner.next();
                        System.out.println("Admin created: " + new Person(jj, ss, yy, kk));
                        System.out.println(method22());
                    }
                case 3:
                    System.exit(0);

            }


        }


    }

    public static String method22() {
        DataBase database = new DataBase();
        GroupServiceImpl groupService = new GroupServiceImpl(database);
        StudentServiceImpl studentService = new StudentServiceImpl(database);
        LessonServiceImpl lessonService = new LessonServiceImpl(database);

        while (true) {
            System.out.println("****Welcome****");
            System.out.println("-> Add new group");
            System.out.println("-> Update group Id");
            System.out.println("-> Get group by name");
            System.out.println("-> Get all group");
            System.out.println("-> Add new Student");
            System.out.println("-> Get all student by group name");
            System.out.println("-> Update student id");
            System.out.println("-> Find student by name");
            System.out.println("-> Delete student");
            System.out.println("-> Add new lesson to the group");
            System.out.println("-> Get all student lesson");
            System.out.println("-> Get lesson by name");
            System.out.println("-> Get all lesson by group name");
            System.out.println("-> Delete lesson");
            System.out.println("-> Exit");
            Scanner scanner11 = new Scanner(System.in);
            int choice = scanner11.nextInt();

            switch (choice) {
                case 1:
                    if (choice == 1) {
                        System.out.print("Put any name for group: ");
                        String name = scanner11.next();
                        scanner11.nextLine();
                        System.out.print("Write description of the group: ");
                        String name2 = scanner11.next();
                        groupService.addNewGroup(new Group(name, name2, new ArrayList<>(), new ArrayList<>()));

                    }
                case 2:
                    if (choice == 2) {
                        System.out.print("Put Id of the group to update the name: ");
                        int nm = scanner11.nextInt();
                        scanner11.nextLine();
                        System.out.print("Write any name: ");
                        String jj = scanner11.nextLine();
                        groupService.UpdateGroupName(nm, jj);

                    }
                case 3:
                    if (choice == 3) {
                        System.out.print("Write name of group: ");
                        String n = scanner11.next();
                        groupService.GetGroupByName(n);

                    }
                case 4:
                    if (choice == 4) {
                        groupService.getAllGroup();
                    }
                case 5:
                    if (choice == 5) {
                        System.out.print("Write name of the group to create the students for: ");
                        String nameGroup = scanner11.next();
                        System.out.print("Write name of student: ");
                        String name3 = scanner11.next();
                        scanner11.nextLine();
                        System.out.print("Write fullName: ");
                        String fullName = scanner11.next();
                        scanner11.nextLine();
                        System.out.print("Put email: ");
                        String email22 = scanner11.next();
                        scanner11.nextLine();
                        System.out.print("Put password: ");
                        int password1 = scanner11.nextInt();


                        System.out.print("Put name of the gender: ");
                        String genderSInput = scanner11.next();
                        Gender gens = Gender.fromString(genderSInput);
                        if (gens != null) {
                            System.out.println(studentService.addNewStudent(
                                    nameGroup, new Student(name3, fullName, email22, password1, gens)));
                        } else {
                            System.out.println("Invalid gender input.");
                        }
                    }


                case 6:
                    if (choice == 6) {
                        System.out.println("Write group name to get all student: ");
                        String gName = scanner11.next();
                        studentService.GetAllStudentByGroupName(gName);
                    }
                case 7:
                    if (choice == 7) {
                        System.out.print("Put Id of the student to update the name of student: ");
                        int num11 = scanner11.nextInt();
                        scanner11.nextLine();
                        System.out.println("Write any name: ");
                        String nnn = scanner11.next();
                        studentService.UpdateStudentName(num11, nnn);

                    }
                case 8:
                    if (choice == 8) {
                        System.out.println("Put full or part name to find the student: ");
                        String h = scanner11.next();
                        studentService.findStudentByFirstName(h);

                    }

                case 9:
                    if (choice == 9) {
                        System.out.println("Put name of the student to delete the student: ");
                        String nu = scanner11.next();
                        studentService.deleteStudent(nu);
                        System.out.println("Deleted");

                    }

                case 10:
                    if (choice == 10) {
                        System.out.print("Write name of the group to add lesson: ");
                        String groupName = scanner11.next();
                        scanner11.nextLine();
                        System.out.print("Write name of lesson: ");
                        String lessonName = scanner11.next();
                        scanner11.nextLine();
                        System.out.print("Put the description of the lesson: ");
                        String description = scanner11.next();
                        System.out.println(lessonService.addNewLessonToGroup(groupName, new Lesson(lessonName, description)));


                    }
                case 11:
                    if (choice == 11) {
                        System.out.print("Write name of the student to get the lessons: ");
                        String lesson = scanner11.next();
                        lessonService.getAllStudentLesson(lesson);

                    }
                case 12:
                    if (choice == 12) {
                        System.out.println("Write name of the lesson: ");
                        String lessonName = scanner11.next();
                        lessonService.getLessonByName(lessonName);

                    }
                case 13:
                    if (choice == 13) {
                        System.out.print("Write name of the group to get all lessons: ");
                        String llName = scanner11.next();
                        lessonService.getAllLessonByGroupName(llName);

                    }
                case 14:
                    if (choice == 14) {
                        System.out.println("Write the Id to delete lesson: ");
                        int idd = scanner11.nextInt();
                        lessonService.deleteLesson(idd);

                    }
                case 15:
                    if (choice == 15) {
                        System.exit(0);
                    }
            }
        }

    }
}

