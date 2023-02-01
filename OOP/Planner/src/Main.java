

public class Main {

    public static void main(String[] args) {


        UI a = new UI();
        Planner plan = a.TaskCreator();

        String info = plan.toString();
        System.out.printf(info);

        SaveFile.saveFile(plan);

    }



}