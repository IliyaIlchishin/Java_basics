

import Controller.Control;
import Model.Personnel.Teacher;
import Model.Personnel.Student;
import Model.Save.Read;
import Model.Save.Save;
import View.UI;

import java.io.IOException;

//import static Model.Save.Save.SaveStudents;

import java.io.FileWriter;

public class Main {

    public static void main(String[] args) throws Exception {

        Student a1 = new Student("Иван","Понаморев",19,89100005,2);
        Student a2 = new Student("Николай","Петров",21,891034535,4);
        Student a3 = new Student("Георгий","Понаморев",22,89135535,5);
        Student a4 = new Student("Евгений","Харитонов",18,89003333,1);
        Teacher aa = new Teacher("Анатлоий","Власов",45,892565533);
        Teacher ab = new Teacher("Геннадий","Тимченко",39,892343000);

        FileWriter file = new FileWriter("Students.json");
        FileWriter file2 = new FileWriter("Teachers.json");
        Save.SaveStudents(a1,file);
        Save.SaveStudents(a2,file);
        Save.SaveStudents(a3,file);
        Save.SaveStudents(a4,file);
        Save.SaveTeachers(aa,file2);
        Save.SaveTeachers(ab,file2);

        Control.Run();

    }

}


