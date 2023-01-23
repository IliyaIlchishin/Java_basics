
public class Main {
    public static void main(String[] args) {

        Male Peter = new Male("Петр",30,"Геннадий","Маргарита");
        System.out.print(Peter.ShowInfo());
        System.out.print("---------------------------------------------------\n");

        Female Galina = new Female("Лариса",24,"Инокентий","Жанна");
        System.out.print(Galina.ShowInfo());
        System.out.print("---------------------------------------------------\n");

        // Создаем ребенка #1
        Human Baby1 = Peter.MakeChild(Peter,Galina) ;
        System.out.print(Baby1.ShowInfo());
        System.out.print("---------------------------------------------------\n");
        // Создаем ребенка #2
        Human Baby2 = Peter.MakeChild(Peter,Galina) ;
        System.out.print(Baby2.ShowInfo());
        System.out.print("---------------------------------------------------\n");

        //Обновленная инфа по отцу и матери
        System.out.print(Peter.ShowInfo());
        System.out.print("---------------------------------------------------\n");
        System.out.print(Galina.ShowInfo());
        System.out.print("---------------------------------------------------\n");



        //данные о детях Peter
        System.out.print("---------------------------------------------------\n");
        Peter.ShowChildren(Peter);

        //данные о братьях сестрах
        System.out.print("---------------------------------------------------\n");
        String Brothers =  Baby2.ShowBrothersSisters(Baby2);
        System.out.print(Baby2.ShowBrothersSisters(Baby2));


    }
}