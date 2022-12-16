package Tasks;
import java.util.ArrayList;
import java.util.List;


public class next 
{
    public static void main(String[] args) 
    {
        
        int [] test = new int [] { 1, 9,76,3,34 };


       List <Integer> age =  Biglist(test);
    }
    
    public static ArrayList<Integer> Biglist(int [] sample)
    {

        ArrayList<String> names = new ArrayList<String>();
        ArrayList<Integer> age = new ArrayList<>();
        ArrayList<Integer> ClassChildren = new ArrayList<>(10);
        ArrayList<Integer> Telephone = new ArrayList<>(age);

        names.add("Peter");
        names.add("Harry");
        names.add("Sucker Punch");
        names.add("Lucy Lu");
        names.add("Jey Lo");
        age.add(12);
        age.add(23);
        names.remove(2);
        
        age.set(1, 99); 

        System.out.print(names);
        System.out.print(age);
        // String name = names.get(1);
        // System.out.printf(name);
        // System.out.printf("\n");
        // System.out.println(names.get(2));
        // System.out.print("index of");
        



        // for ( Object o : names){
        //     System.out.println(o);
        // }
        return age;



        // String [] text = {"Hello", "how", "are", "you","?"};

        // for (String i : text) { System.out.printf("%d ", i);} 

    }
}
