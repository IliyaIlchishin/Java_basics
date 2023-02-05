package Model.Save;

import Model.Personnel.Student;
import Model.Personnel.Teacher;
import java.io.FileWriter;
import java.io.IOException;

public class Save {


    protected static String StudentsCSVPath = "Students.csv";
    protected static String ProfsCSVPath = "Professors.csv";
    protected static String GradesCSVPath = "Grades.csv";


    public static void SaveStudents(Student a, FileWriter file) throws IOException {

        String text = a.toString();
        file.write(text);
        file.append('\n');
        file.flush();

    }

    public static void SaveTeachers(Teacher a, FileWriter file) throws IOException {
        String text = a.toString();
        file.write(text);
        file.append('\n');
        file.flush();
    }



    public void CreateDatabase(){

    }
}







