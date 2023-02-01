
public interface I_Saver {

    //интерфейс создания строк для разных форматов файла
    <T extends Planner> String createStringCSV(T task);
    <T extends Planner> String createStringJSON(T task);
    <T extends Planner> String createStringXML(T task);
}

