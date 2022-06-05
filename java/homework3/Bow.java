public class Bow extends Weapon
{
    private int numberOfArrows;
    private int arrowsCapacity;

    public Bow()
    {
        this(20);
    }
    
    public Bow(int initialArrowsCapacity)
    {
        super();     // maximumAttackPoint with default 100

        arrowsCapacity = initialArrowsCapacity;
        numberOfArrows = arrowsCapacity;
    }

    /*
     * TO FILL IN: write appropriate methods
     */


     
    /* getters and setters */

    public int getNumberOfArrows()
    {
        return numberOfArrows;
    }

    public void setNumberOfArrows(int n)
    {
        numberOfArrows = n;
    }

    public int getArrowsCapacity()
    {
        return arrowsCapacity;
    }

    public void setArrowsCapacity(int c)
    {
        arrowsCapacity = c;
    }
}
