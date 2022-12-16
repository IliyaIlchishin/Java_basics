package HW02;

//import java.util.ArrayList;

//Версия 1
public class HanoiTower 
{

    public static void main(String[] args) 
    {
        int disks = 4;
        HanoiTower(disks,"Лево", "Право", "Центр");
        
    }

	static void HanoiTower(int disks, String Left, String Right, String Middle)
	{
		if (disks == 1)
		{
			System.out.println("Перемещаем диск "+ disks + " с " + Left + " на  " + Right);
			return;
		}
		HanoiTower(disks-1, Left, Middle, Right);
		System.out.println("Перемещаем диск " + disks + " с " + Left + " на " + Right);
	    HanoiTower(disks-1, Middle, Right, Left);
	}
	
  
}

