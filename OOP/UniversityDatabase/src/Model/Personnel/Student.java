package Model.Personnel;

import Model.Subjects.Subject;

import java.util.ArrayList;

public class Student extends Profile {

    protected int StudyYear;
    protected String role = "Student";

    public Student(String Name, String FName, int age, int MobilePhone, int studyYear) {
        super(Name, FName, age, MobilePhone);
        this.StudyYear = studyYear;
    }

    public int GetStudyYear(){
        return this.StudyYear;
    }

    @Override
    public String toString() {
        return "\nid: " + GetID() +
                ", Имя - " + GetName() + ", Фамилия - " + GetFName() +
                ", Статус - " + role +
                "\nвозраст " + GetAge() +
                ", мобильный - " + GetMobile() +
                ", курс " + GetStudyYear();
    }


    // Создаем список с оценками по предмету
    public  ArrayList<Integer> EnlistToSubject(){

        String subj = Subject.ChooSeSubject();

        ArrayList<Integer> subject = new ArrayList<>();

        return subject;
    }


}
