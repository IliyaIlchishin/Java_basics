package Controller;

import java.util.Scanner;
import View.UI;

public class Control {

    /**
     *
     * @GetDataFromUser сканнер данных от пользователя
     * @Run запуск функций из UI
     *
     * */

    public static int GetDataFromUser(){
        Scanner newscan = new Scanner(System.in);

        return newscan.nextInt();
    }

    public static void Run(){
        UI.MainInfo();
        UI.ChooseWorkMode();

    }
}
