public interface Workplace {

    public static Human Hire(Human a) {
        if (a.age > 18) {
            if (a.WorkStatus != "Безработный") {
                a.WorkStatus = "Работает";
                a.WorkPosition = "Кассир";
            }
        }

        return a;
    }

    default Human PaySalary(Human a, String Positon, int day, int Salary){
        if(a.WorkStatus == "Работает") {
            if ( a.WorkPosition == "Кассир"){
                if (day == 28){
                    a.Money = a.Money + Salary;
                }

            }
        }

        return a;
    }
}

