public class Sword extends Weapon
{
    private double sharpness;
    private double deltaSharpness;

    public Sword()
    {
        sharpness = 1.0;
        deltaSharpness = 0.05;
    }

    /* 
     * TO FILL IN: write appropriate methods
     */

     

    /* getters and setters */

    public double getSharpness()
    {
        return sharpness;
    }

    public void setSharpness(double s)
    {
        sharpness = s;
    }

    public double getDeltaSharpness()
    {
        return deltaSharpness;
    }

    public void setDeltaSharpness(double d)
    {
        deltaSharpness = d;
    }

}
