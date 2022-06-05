public class GameCharacter
{
    private String name;

    private int healthPoint;
    private int strength;
    
    /* Constructors */
    public GameCharacter(String characterName)
    {
        name = characterName;
        healthPoint = 50;
        strength = 50;
    }

    /* Methods */

    public void printStatus()
    {
        System.out.println("Name: " + name);
        System.out.println("Health point: " + healthPoint);
        System.out.println("Strength: " + strength);
    }

    public boolean isDead()
    {
        return healthPoint <= 0;
    }

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
}
