import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class fruit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class fruit extends Actor
{
    /**
     * Act - do whatever the fruit wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if(isTouching(player.class)){
        setLocation(Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        }
        }
        
}
