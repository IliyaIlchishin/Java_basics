public class Knight extends Soldier {

    private double health = 120;
    private double MaxHealh = 120;
    private double defense = 10;
    private double atack = 15;
    private String type = "Knight";

    public static double PowerAtack (Soldier a, Soldier b){
        System.out.printf("%s %s attacks %s %s\n",a.type,a.name,b.type,b.name);
        double damage = Soldier.r.nextDouble(a.atack*0.9,a.atack*1.3);
        b.health = (b.health + b.defense)- damage;
        double Hithealth = damage - b.defense;
        a.SetExp(Hithealth);
        a.LevelUp(a);
        return b.health;

    }


}
