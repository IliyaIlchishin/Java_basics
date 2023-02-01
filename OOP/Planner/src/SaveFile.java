import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SaveFile extends Planner {


    protected static String csvPath = "Planner.csv";
    protected static String jsonPath = "Planner.json";
    protected static String xmlPath = "Planner.xml";


    public static <T extends Planner> String createStringCSV(T Planner) {
        return String.format("%d,%s,%s,%s,%s,%s,%s\n",
                Planner.getId(), Planner.getSubject(),
                Planner.getAuthor(),Planner.getAddTime(),
                Planner.getAddDate(), Planner.Deadline(),
                Planner.getPriority());
    }

    public static <T extends Planner> String createStringJSON(T task) {
            return String.format("""
                {
                "id" : %d, {
                "Task":%s,
                "author":"%s",
                "adding time":"%s"
                "adding date":"%s"
                "deadline":"%s"
                "priority":"%s"
                }
                }
                """, task.getId(), task.getSubject(),
                    task.getAuthor(), task.getAddTime(),
                    task.getAddDate(), task.Deadline(),
                    task.getPriority());
        }

    public static <T extends Planner> String createStringXML(T task) {
        return null;
    }


    public static void saveFile(Planner plan)  {
        Scanner scanMe = new Scanner(System.in);
        System.out.printf("\nПожалуйста выберите формат записи\n");
        System.out.printf("1 - xml; 2 - json; 3 - CSV\n");
        System.out.printf("Введите цифру - ");
        int choice = scanMe.nextInt();
        String text="";
        String Savepath="";

        if (choice == 1){
            Savepath = xmlPath;
            text =createStringXML(plan);}
        if (choice == 2){
            Savepath = jsonPath;}
            text =createStringJSON(plan);
        if (choice == 3) {
            Savepath = csvPath;
            text = createStringCSV(plan);
        }
        try (FileWriter fw = new FileWriter(Savepath, false)) {
            fw.write(text);
            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }



}










