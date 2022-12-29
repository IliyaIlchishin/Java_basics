public class Main {
    public static void main(String[] args) {

        String[] message = new String[]{"excavate", "endure", "desire", "screen", "theater", "excess", "night"};

        String word = message[0];
        int length = word.length();
        System.out.println("word: " + word);
        System.out.println("length: " + length);

        char firstChar = message[0].charAt(0);
        char lastChar = message[0].charAt(length-1);
        System.out.println("First char is : " + firstChar);
        System.out.println("Last char is : " + lastChar);


        for (int i = 0; i< message.length; i++){



        }


    }
}

//Input
//
//        Array of 3 to 7 words of random length. No capital letters.
//
//        Example true
//
//        Set: excavate, endure, desire, screen, theater, excess, night.
//        Millipede: desirE EndurE ExcavatE ExcesS ScreeN NighT Theater.
//
//        Example false
//
//        Set: trade, pole, view, grave, ladder, mushroom, president.
//        Millipede: presidenT Trade.