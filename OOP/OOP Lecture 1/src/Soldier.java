import java.util.Random;
import java.util.random.*;
public class Soldier {

    protected String type = "Soldier";
    protected int level = 1;
    protected double health = 100;
    protected double MaxHealh = 100;
    protected double defense = 5;
    protected double atack = 10;
    protected int speed = 10;
    protected double experience = 1;
    protected double NXTLVLexperience = 5;
    protected static Random r;
    protected String name;


    static {

        Soldier.r = new Random();
    }
    public void setName (String name)
    {
        this.name = name;
    }
    public void GetExp()
    {
        System.out.print(experience);
    }

    protected double SetExp (double HitHealth){
        experience = experience + HitHealth;
        return experience;
    }

    protected double SetHealth(Soldier a){
        double modifier = (0.1 * level)+1;
        MaxHealh = MaxHealh * modifier;
        return MaxHealh;

    }

    public void SetSpeed(int speed){
        this.speed = (speed+speed/10);
        System.out.print(speed);
    }
    protected double SetAttack(Soldier a){
        double modifier = (0.05 * level)+1;
        atack = atack * modifier;
        return atack;
    }
    protected double SetDefense(Soldier a){
        double modifier = (0.05*level)+1;
        defense = defense * modifier;
        return defense;
    }

    protected int LevelUp (Soldier a)
    {
        int modifier = level * 3;
        if (experience >= NXTLVLexperience*modifier)
        {
            level = level +1;
            experience = 0;
            MaxHealh = SetHealth(a);
            health = MaxHealh;
            atack = SetAttack(a);
            defense = SetDefense(a);
        }
        return level;
    }


    public static double Atack (Soldier a, Soldier b){
        System.out.printf("%s %s attacks %s %s\n",a.type,a.name,b.type,b.name);
        double damage = Soldier.r.nextDouble(a.atack*0.9,a.atack*1.1);
        b.health = (b.health + b.defense)- damage;
        double Hithealth = damage - b.defense;
        a.SetExp(Hithealth);
        a.LevelUp(a);
        return b.health;

    }

    protected static String GetCharecteristics (Soldier a){
        return String.format("type - %s , name - %s, level - %d, health - %f, atack - %f, defense - %f\n"
                , a.type, a.name, a.level, a.health, a.atack, a.defense);

    }

    public void PrtintChar(Soldier a)
    {
        System.out.print(GetCharecteristics(a));
    }



}
