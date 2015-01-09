import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Batu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Batu extends Actor
{
    /**
     * Act - do whatever the Batu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        move(Greenfoot.getRandomNumber(5)*2);
        if(isAtEdge()){
        turn(Greenfoot.getRandomNumber(360)/7);
    }
    if(isTouching(Lebah.class)){
        Lebah.batuCounter++;
        getWorld().removeObject(this);
    }
        //Greenfoot.delay(500);
        
    }    
}
