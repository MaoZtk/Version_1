import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MazeRunner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MazeRunner extends Movers
{
    /**
     * Act - do whatever the MazeRunner wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    //Create our Constructor Method
    public MazeRunner()
    {
        getImage().scale(getImage().getWidth()/2, getImage().getHeight()/2);
    }
    public void act()
    {
      slideAround();
      collectBoost();
      maxSpeed();
    }
}
