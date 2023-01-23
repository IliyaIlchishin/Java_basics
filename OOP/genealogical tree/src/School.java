public class School extends Building implements PublicBuildings{

    private int sizeSQM;
    private int length;
    private int width;
    private int height;
    private int NumOfFloors;
    private String Type = "Building.School";
    int MaxNumStudents;
    int NumTeachers;


    @Override
    public boolean WorkTime(int openHour, int closeHour) {
        return false;
    }
}
