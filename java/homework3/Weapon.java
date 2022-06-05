public class Weapon
{
    private int maximumAttackPoint;

    public Weapon() 
    {
        maximumAttackPoint = 100;
    }

    /* To override */
    public void generateAttackPoint()
    {
        int damage = (int)(Math.random() * maximumAttackPoint) + 1;

        System.out.println("Attacking...");
        System.out.println("Opponent damage will be " + damage);
    }

    /* To override */
    public void applyWeaponUse()
    {
        System.out.println("No maintenance needed.");
    }

    /* To override */
    public void printStatus()
    {
        System.out.println("No status needs printing.");
    }

    /* getters and setters */

    public int getMaximumAttackPoint()
    {
        return maximumAttackPoint;
    }

    public void setMaximumAttackPoint(int a)
    {
        maximumAttackPoint = a;
    }
}
