package View;

import Model.Save.Read;

import java.util.Scanner;
import Controller.Control;

public class UI {

    int GenPasswordForTeachers = 12345;

    /**
     * @MainInfo приветсвие
     * @ChooseWorkMode входная точка в выборе режима работы
     * @Authoresation авторизация по паролю для преподавателей
     */
    public static void MainInfo(){
        System.out.println("Это Университет 1.0");
        System.out.println("Добро пожаловать в базу данных");
    }

    public static void ChooseWorkMode(){

        System.out.println("Пожалуйста, выберите режим работы");
        System.out.println("1 - преподавател, 2 - студент");
        int choice = Control.GetDataFromUser();
        if (choice ==1){ Authoresation();
        }
        if (choice ==2){StudentsMenu();

        }
    }

    protected static void Authoresation(){
        System.out.println("Для доступа к разделу преподавателей введите пароль");
        int password = Control.GetDataFromUser();
        if (password == 12345){
            System.out.println("Успешная авторизация");
            TeacherMenu();
        }
        else{System.out.println("Вы ввели не правильный пароль");
        ChooseWorkMode();}
    }


    protected static void StudentsMenu(){
        System.out.println("Разделы");
        System.out.println("1 - Список преподавателей");
        System.out.println("2 - Расписание");
        int choice = Control.GetDataFromUser();

        switch (choice){
            case 1:
                try {
                    Read.ReadDatabase();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;}

    }

    protected static void TeacherMenu(){
        System.out.println("Разделы");
        System.out.println("1 - Список преподавателей");
        System.out.println("2 - Список учеников");
        System.out.println("3 - Найти ученика");
        System.out.println("4 - Найти преподавателя");
        System.out.println("5 - Расписание");

        int choice = Control.GetDataFromUser();

            switch (choice){
                case 1:
                    try {
                        Read.ReadDatabase();
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    break;
                 case 2:
                     break;
                 case 3:
                     break;
                 case 4:
                    break;
                 case 5:
                    break;}


    }

}

