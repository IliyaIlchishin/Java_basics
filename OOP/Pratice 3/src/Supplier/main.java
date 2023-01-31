package Supplier;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Supplier<User> userFactory = ()-> {
            Scanner in = new Scanner(System.in);
            System.out .println(" введите имя:");
            String name = in.nextLine();
            return new User(name);
        }



    }
 class User{
        private String name;
        String getName(){
            return name;
        }
        User (String n){
            this.name = n;
        }


}

}
