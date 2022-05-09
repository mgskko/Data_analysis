public class GameCharacter {
    
    private String name;
    private int healthPoint;
    private int strength;

    /*Constructors */
    public GameCharacter(String charachterName){
        name = charachterName;
        healthPoint = 50;
        strength = 50;
    }

    /* Methods */

    public void printStatus(){
        
        System.out.println("Name " + name);
        System.out.println("Health point: " + healthPoint);
        System.out.println("Strength : " + strength);
    }

    public int attack(GameCharacter opponent){
        int damage = generateAttackHiPoint();
        //int  opponentCurrentHp = opponent.getHealthPoint();
        //int opponentUpdateHp = opponentCurrentHp - damage;
        //opponent.setHealthPoint(opponentUpdateHp);
        opponent.setHealthPoint(opponent.getHealthPoint() - damage);
        return damage;
        
    }

    public boolean isDead(){
        return healthPoint <= 0;
    }

    private int generateAttackHiPoint(){
     int hitPoint = 0;
     hitPoint = (int)(Math.random() * strength) + 1;  //from 1 to strength
        return hitPoint;
    }

/* 

    public int attack(GameCharacter opponent){
        int damage = game.generateAttackHitPoint(strength);
        //int opponentCurrentHp = opponent.getHealthPoint();
        //int opponentUpdateHp = opponentCurrentHp - damage;
        // opponent.setHealthPoint(opponentUpdateHp);
        opponent.setHealthPoint(opponent.getHealthPoint() - damage);
        return damage;
    }
    private int randomGenerator(int size){
        return (int)(Math.random()*(size + 1));
    }

   

    public int attack(GameCharacter enemy){
        int hitPoint = generateAttackHiPoint();
        enemy.setHealthPoint(enemy.getHealthPoint() - hitPoint);

        return hitPoint;
    }
     
   
    /*getters and setters */
    public String getName(){
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

    public void setHealthPoint(int updateHealthPoint){
healthPoint = updateHealthPoint;
    }
}
