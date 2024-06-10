package less4.service;


import less4.model.Student;
import less4.model.Teatcher;
import less4.view.StudentView;
import less4.view.TeacherView;
import less4.view.UserView;

import java.util.List;

public class TeacherService {
    private UserView<Teatcher> view = new TeacherView();


    public void sendOnConsole(List<Teatcher> teachers){
        view.sendOnConsole(teachers);

    }




    public Teatcher createTeacher(int id, String name, String last) {
        return new Teatcher(id, name, last);
    }






    public void setTeacher(Teatcher teacher1, Teatcher teacher2){
        teacher1.setName(teacher2.getName());
        teacher1.setLastName(teacher2.getLastName());
        teacher1.setId(teacher2.getId());


    }

}
