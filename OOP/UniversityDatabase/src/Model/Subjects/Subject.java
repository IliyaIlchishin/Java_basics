package Model.Subjects;

import java.util.Scanner;

public class Subject {

    protected String Math = "Математика";
    protected String Informatics = "Информатика";
    protected String English = "Английский";
    protected String Physics = "Физика";
    protected String Chemistry = "Химия";


    public static String ChooSeSubject() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Пожалуйства выберите предмет");
        System.out.print("1 - Математика, 2 - Информатика, 3 - Английский");
        System.out.print("4 - Физика, 5 - Химия");
        int choice = scan.nextInt();
        String subject = "";
        switch (choice) {
            case 1:
                subject = "Математика";
            break;
            case 2:
                subject = "Информатика";
            break;
            case 3:
                subject = "Английский";
            break;
            case 4:
                subject = "Физика";
            break;
            case 5:
                subject = "Химия";
            break;
        }

        return subject;
    }

}
