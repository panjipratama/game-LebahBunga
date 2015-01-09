import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bunga here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bunga extends Actor
{
    public static int JUMLAH_OBJ_BUNGA=0;
    /**
     * Act - do whatever the Bunga wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Bunga(){
        turn(90);
    }
    public void act() 
    {
        // Add your action code here.
        move(2);
        if(isAtEdge())
            turn(180);
    }    
}
