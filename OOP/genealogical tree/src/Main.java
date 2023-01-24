
public class Main {
    public static void main(String[] args) {

        Male Peter = new Male("Петр",30,"Геннадий","Маргарита");
        System.out.print(Peter.ShowInfo());
        System.out.print("---------------------------------------------------\n");
        Male Francisco = new Male("Францико",25,"Герман","Светлана");
        System.out.print(Francisco.ShowInfo());
        System.out.print("---------------------------------------------------\n");
        Female Larisa = new Female("Лариса",24,"Инокентий","Жанна");
        System.out.print(Larisa.ShowInfo());
        System.out.print("---------------------------------------------------\n");
        Female Galina = new Female("Галина",34,"Ираклий","Тамара");
        System.out.print(Galina.ShowInfo());
        System.out.print("---------------------------------------------------\n");


        // Создаем детей
        Human Baby1 = Peter.MakeChild(Peter,Galina) ;
        Human Baby2 = Peter.MakeChild(Peter,Galina) ;
        Human Baby3 = Francisco.MakeChild(Francisco,Larisa) ;

        System.out.print(Baby1.ShowInfo());
        System.out.print("---------------------------------------------------\n");
        System.out.print(Baby2.ShowInfo());
        System.out.print("---------------------------------------------------\n");
        System.out.print(Baby3.ShowInfo());
        System.out.print("---------------------------------------------------\n");
        System.out.print(Baby3.ShowInfo());
        System.out.print("---------------------------------------------------\n");

        Peter.MakeFriendsWith(Baby1,Baby2);
        Peter.MakeFriendsWith(Baby3,Baby1);

        System.out.print("-------------Обновленная инфа по детям--------------\n");
        System.out.print(Baby1.ShowInfo());
        System.out.print("---------------------------------------------------\n");
        System.out.print(Baby2.ShowInfo());
        System.out.print("---------------------------------------------------\n");
        System.out.print(Baby3.ShowInfo());
        System.out.print("---------------------------------------------------\n");


        //Обновленная инфа по отцу и матери
        System.out.print(Peter.ShowInfo());
        System.out.print("---------------------------------------------------\n");
        System.out.print(Galina.ShowInfo());
        System.out.print("---------------------------------------------------\n");

        //Создаем супермаркет

        Building Five = new Supermarket("Пятерочка",15 );
        Human Josh = new Male("Джош",24,"Иван","Анжелика");
        Josh = Workplace.Hire(Josh);
        System.out.print("---------------------------------------------------\n");
        System.out.print("---------------------------------------------------\n");
        System.out.print("---------------------------------------------------\n");
        System.out.print(Josh.ShowInfo());

          }
}