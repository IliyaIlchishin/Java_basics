package HW02;

import java.util.ArrayList;

public class HanoiTower2 {

    public static void main(String[] args)

    {
        int disk = 3;
        ArrayList<Integer> Left = new ArrayList<Integer>(disk);
        ArrayList<Integer> Middle = new ArrayList<Integer>(0);
        ArrayList<Integer> Right = new ArrayList<Integer>(0);
        for (int i = disk; i >= 1; i--) {
            Left.add(i);
        }
        System.out.printf("Left  - ");
        System.out.println(Left);

        HanoiTower(Left, Right, Middle);
    }

    static void HanoiTower(ArrayList<Integer> Left, ArrayList<Integer> Right, ArrayList<Integer> Middle) {
        if (Left.size() == 1) 
        {
            Right.add(Left.get(Left.size() - 1));
            Left.remove(Left.size() - 1);
            System.out.printf("Left >> Right \n");
            System.out.printf("Left - %s, Right - %s, Middle - %s ", Left, Right, Middle);
        } 
        else
        {
            //#1 A>B
            Middle.add(Left.get(Left.size() - 1));
            Left.remove(Left.size() - 1);
            System.out.printf("Left >> Middle \n");
            System.out.printf("Left - %s, Middle - %s, Right - %s \n", Left, Middle, Right);
            //#2 A>C             
            Right.add(Left.get(Left.size() - 1));
            Left.remove(Left.size() - 1);
            System.out.printf("Left >> Right \n");
            System.out.printf("Left - %s, Middle - %s, Right - %s \n", Left, Middle, Right);
            //#3 B>C
            Right.add(Left.get(Left.size() - 1));
            Middle.remove(Left.size() - 1);
            System.out.printf("Middle >> Middle \n");
            System.out.printf("Left - %s, Middle - %s, Right - %s \n", Left, Middle, Right);
            //#4 A.B
            Middle.add(Left.get(Left.size() - 1));
            Left.remove(Left.size() - 1);
            System.out.printf("Left >> Middle \n");
            System.out.printf("Left - %s, Middle - %s, Right - %s \n", Left, Middle, Right);
            //#5 C>A
            // Left.add(Left.get(Left.size() - 1));
            // Right.remove(Left.size() - 1);
            // System.out.printf("Left >> Middle \n");
            // System.out.printf("Left - %s, Middle - %s, Right - %s \n", Left, Middle, Right);


        
            
            // uppose we want to move a disc from A to C through B then:

            // #move a smaller disc to B.
            // #move another disc to C.
            // #move B to C.
            // move from A to B.
            // move all from C to A

    }
}
}

// System.out.print(Left.get(0) + " ");



