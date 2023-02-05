package Model.Save;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import Controller.Control;
import View.UI;

public class Read {
    /**
     * @ReadDatabase Метод чтения json файла
     *
     */
    public static void ReadDatabase() throws Exception {

        System.out.println("Пожалуйста, выберите БД вы хотите посмотреть");
        System.out.println("1 - Преподаватели, 2 - ученики");
        int choice = Control.GetDataFromUser();
        String path = "";
        if (choice == 1){path = "Teachers.json";}
        if (choice == 2){path = "Students.json";}

        String json = readFileAsString(path);
        System.out.println(json);

        System.out.println("0 - вернуться назад");
        choice = Control.GetDataFromUser();
        if (choice == 0){
            UI.ChooseWorkMode();}
    }
    public static String readFileAsString(String file)throws Exception
    {
        return new String(Files.readAllBytes(Paths.get(file)));
    }
}
