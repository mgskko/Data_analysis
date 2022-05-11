public class gameplay {
    /* instance variable */
    private GameCharacter player, monster;
    private String gameName;
    // Random number generator

    public gameplay() {
        gameName = "";
    }

    public gameplay(String name) {
        gameName = name;
    }

    public int generateAttackHiPoint(int strength) {
        int hitPoint = 0;
        hitPoint = (int) (Math.random() * strength) + 1; // from 1 to strength
        return hitPoint;
    }

    public void play() {
        GameCharacter player, monster;

        player = new GameCharacter("Foober the Warriorpz");
        monster = new GameCharacter("Slime the Great");

        // pass instance information of GamePlay to GameCharacter instances
        player.setGame(this);
        monster.setGame(this);

        System.out.println("####################");
        System.out.println("### Game starts ###");
        System.out.println("####################");
        System.out.println();

        int round = 1;
        int damage = 0;

        while (true) {
            System.out.println("### Round " + round);

            player.printStatus();
            monster.printStatus();
            System.out.println();

            /* player attacks monster */
            damage = player.attack(monster);
            System.out.println(player.getName() + " attacks " + monster.getName());
            System.out.println(monster.getName() + " gets damage of " + damage);

            if (monster.isDead() == true) {
                System.out.println(player.getName() + " killed " + monster.getName() + "!");
                break;
            }
            /* monster attacks player */
            damage = monster.attack(player);
            System.out.println(monster.getName() + " attacks " + player.getName());
            System.out.println(player.getName() + " gets damage of " + damage);

            if (player.isDead() == true) {
                System.out.println(monster.getName() + " killed " + player.getName() + "!");
                break;
            }
            round = round + 1;
            System.out.println();
        }
        System.out.println("##Game over at round" + round);
    }
}
