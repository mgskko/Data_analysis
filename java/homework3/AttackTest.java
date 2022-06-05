public class AttackTest
{
    public static void main(String[] args)
    {
        Warrior w = new Warrior("Hercules");

        Weapon hand = new Weapon();
        hand.setMaximumAttackPoint(10);

        Weapon shortSword = new Sword();
        shortSword.setMaximumAttackPoint(100);

        Weapon longBow = new Bow();
        longBow.setMaximumAttackPoint(150);

        System.out.println("### Now comes the warrior");
        w.printStatus();

        System.out.println();

        /* Use hand (default) */
        System.out.println("### 1: attacking with hands (default)");
        w.equip(hand);

        w.attack(); System.out.println();
        w.attack(); System.out.println();

        System.out.println();

        /* Use shortSword  */
        System.out.println("### 2: attacks with a shortSword");
        w.equip(shortSword);

        w.attack(); System.out.println();
        w.attack(); System.out.println();
        
        System.out.println();

        /* Use longBow */
        System.out.println("### 3: attacks with a longBow");
        w.equip(longBow);

        w.attack(); System.out.println();
        w.attack(); System.out.println();
    }
}
