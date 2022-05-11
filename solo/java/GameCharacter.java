public class GameCharacter {

    private String name;
    private int healthPoint;
    private int strength;
    private gameplay game;

    /* Constructors */
    public GameCharacter(String charachterName) {
        name = charachterName;
        healthPoint = 50;
        strength = 50;
    }

    /* Methods */

    public void printStatus() {

        System.out.println("Name: " + name);
        System.out.println("Health point: " + healthPoint);
        System.out.println("Strength : " + strength);
    }

    public int attack(GameCharacter opponent) {
        int damage = game.generateAttackHiPoint(strength);
        // int opponentCurrentHp = opponent.getHealthPoint();
        // int opponentUpdateHp = opponentCurrentHp - damage;
        // opponent.setHealthPoint(opponentUpdateHp);
        opponent.setHealthPoint(opponent.getHealthPoint() - damage);
        return damage;

    }

    public boolean isDead() {
        return healthPoint <= 0;
    }

    /* getters and setters */
    public String getName() {
        return name;
    }

    public void setName(String updateName) {
        name = updateName;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(int updateHealthPoint) {
        healthPoint = updateHealthPoint;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int updateStrength) {
        strength = updateStrength;
    }

    public gameplay getGame() {
        return game;
    }

    public void setGame(gameplay g) {
        game = g;
    }
}
