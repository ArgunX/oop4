package less4.controller;

import less4.model.Teatcher;
import less4.model.User;
import less4.service.TeacherService;

import java.util.List;

public class TeacherController implements UserController{

  private TeacherService  service = new TeacherService();

  public void sendOnConsole(List<Teatcher> teatchers){
      service.sendOnConsole(teatchers);
  }

  public void setTeacher(Teatcher teacher1,Teatcher teacher2){
      service.setTeacher(teacher1,teacher2);
  }

  public  Teatcher createTeacher(int id, String name, String last){
      return service.createTeacher(id, name, last);
  }



    @Override
    public <T extends User> User create(T user) {
        return user;
    }


}
