public class Warrior extends GameCharacter
{
    private Weapon weapon;

    public Warrior(String name)
    {
        super(name);
    }

    public void equip(Weapon w)
    {
        setWeapon(w);
    }

    public void attack()
    {
        weapon.generateAttackPoint();
        weapon.applyWeaponUse();
        weapon.printStatus();
    }

    /* getters and setters */

    public Weapon getWeapon()
    {
        return weapon;
    }

    public void setWeapon(Weapon w)
    {
        weapon = w;
    }
}
