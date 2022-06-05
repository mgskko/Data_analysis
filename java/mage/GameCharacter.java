public class GameCharacter
{
    private String name;

    private int healthPoint;
    private int strength;
    private int dexterity; 
    
    private GamePlay game;

    /* Constructors */
    public GameCharacter(String characterName)
    {
        name = characterName;
        healthPoint = 50;
        strength = 50;
        dexterity = 50;
    }

    /* Methods */

    public void printStatus()
    {
        System.out.println("Name: " + name);
        System.out.println("Health point: " + healthPoint);
        System.out.println("Strength: " + strength);
        System.out.println("Dexterity: " + dexterity);
    }

    public int attack(GameCharacter opponent)
    {
        int damage = game.generateAttackHitPoint(strength);
        
        //int opponentCurrentHp = opponent.getHealthPoint();
        //int opponentUpdateHp = opponentCurrentHp - damage;
        //opponent.setHealthPoint(opponentUpdateHp);

        opponent.setHealthPoint(opponent.getHealthPoint() - damage);

        return damage;
    }

    public boolean isDead()
    {
        return healthPoint <= 0;
    }

    /* atack() method */

    /* getters and setters */
    
    public String getName()
    {
        return name;
    }

    public void setName(String updateName)
    {
        name = updateName;
    }

    public int getHealthPoint()
    {
        return healthPoint;
    }

    public void setHealthPoint(int updateHealthPoint)
    {
        healthPoint = updateHealthPoint;
    }

    public int getStrength()
    {
        return strength;
    }

    public void setStrength(int updateStrength)
    {
        strength = updateStrength;
    }

    public GamePlay getGame()
    {
        return game;
    }

    public void setGame(GamePlay g)
    {
        game = g;
    }

    public int getDexterity()
    {
        return dexterity;
    }

    public void setDexterity(int updateDexterity)
    {
        dexterity = updateDexterity;
    }
}
