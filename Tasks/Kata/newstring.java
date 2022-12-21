package Tasks.Kata;

public class newstring {
    public static void main(String[] args) {
        String test = "No offense but,your writing is among the worst I've ever read";
        DeleteVowels(test);
        System.out.println(DisemVowel(test));
        
    }

    public static void DeleteVowels(String sentence)
    {
    String strNew = sentence.replace("a", "");
    strNew = strNew.replace("e", "");
    strNew = strNew.replace("i", "");
    strNew = strNew.replace("o", "");
    strNew = strNew.replace("u", "");

    System.out.printf(strNew);
    System.out.print("\n");
    System.out.print("-----------------------------------\n");
    }

    public static String DisemVowel (String sentence)
    {
        return sentence.replaceAll("[aAeEiIoOuU]", "");
    }



}  

