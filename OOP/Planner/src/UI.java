import java.util.Scanner;

public class UI implements I_Note{
    I_Saver I_Saver;

    /**
     * Запускаем ручное создание задачи через консольный ввод данных
     * @return задачу
     */


    public Planner TaskCreator (){
        Scanner nsc = new Scanner(System.in);

        System.out.printf("Введите тему: ");
        String subject = nsc.nextLine();

        System.out.printf("Автор: ");
        String author = nsc.nextLine();

        System.out.printf("Введите дату окончания в формате dd.mm.yyyy: ");
        String deadline = nsc.nextLine();

        System.out.printf("Приоритет. 1 - низкий, 2 - средний, 3 -высокий: ");
        int priority = nsc.nextInt();


        Planner task = new Planner<>(subject,author,priority,deadline);
        return task;
    }
    //вывод инфы о задаче
    public void ShowTaskInfo(){}


    //вывод списка задач (фильтр по дедлайну)
    public void ShowTask(){}

    //поиск задачи по id, либо теме
    public void FindTask(){}


    @Override
    public Object CreateNote() {

        return null;
    }


}
