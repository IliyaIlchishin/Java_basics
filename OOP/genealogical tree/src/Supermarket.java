public class Supermarket extends PublicBuildings  implements  Workplace{

    String Position1 = "Кассир";
    int CashierMonthlySalary = 40000;
    String Position2 = "Директор";
    int DirectorMonthlySalary = 80000;


    Supermarket(String CompanyName, int NumberOfEmployees) {
        this.CompanyName = CompanyName;
        this.NumberOfEmployees = NumberOfEmployees;

    }

    @Override
    public Human PaySalary(Human a, String Positon, int day, int Salary) {
        return Workplace.super.PaySalary(a, Positon, day, Salary);
    }

    @Override
    protected boolean WorkTime() {
        return false;
    }
}
