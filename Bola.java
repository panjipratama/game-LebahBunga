import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bola here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bola extends Actor
{
    /**
     * Act - do whatever the Bola wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        
            
        move(200);
        if((isTouching(Batu.class)) ||(isAtEdge()))
        {
            if(isTouching(Batu.class))
                Lebah.batuCounter--;
            
            getWorld().removeObject(this);
        }
       // if(isAtEdge())
         //   getWorld().removeObject(this);
    }    
    public Bola(){
    if(Lebah.maju==false)
            turn(180);
    }
}
