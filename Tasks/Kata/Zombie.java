package Tasks.Kata;

public class Zombie {
    public static void main(String[] args) {

        String gameres = zombieShootout(4, 4f, 6);
        System.out.print(gameres);
        
    }
    // Upgrade - buy ammo;
    // Upgrade - more powerful gun
    // Shop every round 
    // Prostitute - boost
    // Robot helper
    // Grenades and magazine 
    // Every 5th round the number of zombies doubles
    // Random spawning of zombies every 2nd round
    // Create zombie Boss with extended lifes
    // Money per zombie kill

    public static String zombieShootout(int zombies, Float range, int ammo) 
    {
        int kills = 0;
        int round = 0;

        String GameOver = "";

        while (range > 0.5 && ammo > 1)
        
        {
          System.out.printf("Round %d \n", round);
          System.out.printf("Zombies alive %d, zombies killed %d, distance remain - %f, Ammo - %d \n", zombies, kills, range, ammo);

          zombies --;
          kills++;
          ammo--;
          if (zombies == 0 && range > 0.5f)
          {
            GameOver = "You shot all zombies.";
          }
          range = range - 0.5f;
          round++;
          
        }
        if (ammo == 0){
            GameOver = "You shot so many zombies before being eaten: ran out of ammo.";
            //return Systemout.print("You shot X zombies before being eaten: ran out of ammo.", kills)
          }
          
          if (range == 0){
            GameOver = "You shot so many zombies before being eaten: overwhelmed.";
            //return System.out.print("You shot X zombies before being eaten: overwhelmed.", kills)
    }
    return GameOver;

}
}