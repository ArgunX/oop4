package less4;

import less4.controller.StudentController;
import less4.controller.TeacherController;
import less4.model.Student;
import less4.model.Teatcher;

import java.util.List;

public class Lesson4 {

    public static void main(String[] args) {

        new StudentController()
                .sendOnConsole(List.of(new Student(1, "Sasha", "Ivanov"),
                        new Student(1, "Ira", "Ivanova")));


      TeacherController teacherC = new TeacherController();
        Teatcher grigory = new Teatcher(2,"Grigoriy","Andreev");
        Teatcher mihail = new Teatcher(3,"Mihail","Taraskin");
        Teatcher anton = teacherC.createTeacher(8,"Anton","Abramov");

        teacherC.sendOnConsole(List.of(grigory,mihail,anton));

        teacherC.setTeacher(grigory,new Teatcher(4,"Albert","Enshtain"));

        teacherC.sendOnConsole(List.of(grigory,mihail));




    }

//    private static List<Student> getStudents() {
//        Student s1 = new Student(1, "Sasha", "Ivanov");
//        Student s2 = new Student(1, "Ira", "Ivanova");
//        return List.of(s1, s2);
//    }
}
